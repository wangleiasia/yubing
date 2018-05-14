package com.yubing.web.controller.env;

import com.yubing.util.DateUtil;
import com.yubing.util.JsonDateValueProcessor;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.env.interfaces.I工况表SV;
import com.yubing.web.csv.service.env.interfaces.I样品管理SV;
import com.yubing.web.csv.service.env.interfaces.I监测点管理SV;
import com.yubing.web.csv.service.env.interfaces.I锅炉数据SV;
import com.yubing.web.csv.service.env.interfaces.I锅炉模板SV;
import com.yubing.web.model.env.工况表;
import com.yubing.web.model.env.样品管理;
import com.yubing.web.model.env.监测点管理;
import com.yubing.web.model.env.锅炉数据;
import com.yubing.web.model.env.锅炉模板;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import com.yubing.web.model.env.大气样品;

//import com.yubing.web.model.env.大气样品;

//import com.yubing.web.model.env.大气样品;

/**
 * Created by wanglei on 2017/12/17.
 */
@Controller
public class EnvController {

    private static final Logger LOGGER = Logger.getLogger(EnvController.class);

    @Resource
    private I监测点管理SV s监测点管理SVImpl;
    @Resource
    private I工况表SV s工况表SVImpl;
    @Resource
    private I锅炉数据SV s锅炉数据SVImpl;
    @Resource
    private I锅炉模板SV s锅炉模板SVImpl;
//    @Resource
//    private I大气样品SV s大气样品SVImpl;
    @Resource
    private I样品管理SV s样品管理SVImpl;

    @ResponseBody
    @RequestMapping(value = "/boilerUpload", produces = "text/json;charset=UTF-8")
    public String addNewRecord(样品管理 airTemplate, HttpServletRequest request) throws Exception {

        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                String fileName = (String)iter.next();
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(fileName);
                /**
                if (file != null) {
                    String path = "E:/springUpload" + file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                }
                **/
                //读取文件内容
                //记录一些关键信息
                Map<String,String> keyInfo = new HashMap<String, String>();
                List<锅炉数据> records = new ArrayList<锅炉数据>();
                BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
                String line = null;
                while((line = reader.readLine()) != null) {
                    //这里添加业务逻辑
                    saveUploadReaord(line,airTemplate,keyInfo,records,request);
                }
                //保存锅炉数据
                s锅炉数据SVImpl.addRecords(records);

                //锅炉数据上传成功后，需要修改大气样品，修改条件：项目编号、点位编号、样品编号、时间段
                /**
                Map<String,String> cond = new HashMap<String, String>();
                cond.put("项目编号",airTemplate.get项目编号());
                cond.put("点位编号",airTemplate.get点位编号());
                cond.put("样品编号",airTemplate.get样品编号());
                cond.put("时间段",airTemplate.get时间段());
                airTemplate.set勾选("y");
                s样品管理SVImpl.modify(cond,airTemplate);
                 **/
            }

        }
        long endTime = System.currentTimeMillis();
        LOGGER.info("文件上传消费时间：" + String.valueOf(endTime - startTime) + "ms");

        return ControllerUtil.result(true, "文件上传成功");
    }

    //处理上传文件的内容
    private void saveUploadReaord(String line,样品管理 airTemplate,Map<String,String> keyInfo,List<锅炉数据> records,HttpServletRequest request) throws Exception {
        if(StringUtils.isBlank(line)) {
            return;
        }
        if(line.startsWith("*") || line.startsWith("=") || line.startsWith("-")) {
            return;
        }
        if(line.startsWith("记录编号")) {
            String leftRecord = line.substring(0,line.indexOf("滤筒编号"));
            String rightRecord = line.substring(line.indexOf("滤筒编号"),line.length());
            String[] leftRecords = null;
            String[] rightRecords = null;
            if(leftRecord.contains(":")) {
                leftRecords = leftRecord.split(":");
            }else{
                leftRecords = leftRecord.split("：");
            }
            if(rightRecord.contains(":")) {
                rightRecords = rightRecord.split(":");
            }else{
                rightRecords = rightRecord.split("：");
            }
            if(leftRecords != null && leftRecords.length == 2) {
                keyInfo.put(StringUtils.trim(leftRecords[0]), StringUtils.trim(leftRecords[1]));
            }
            if(rightRecords != null && rightRecords.length == 2) {
                keyInfo.put(StringUtils.trim(rightRecords[0]), StringUtils.trim(rightRecords[1]));
            }
        }else if(line.contains(":") || line.contains("：")) {
            resolve(line,keyInfo,request);
        }else if(line.contains("=")){
            resolve(line,airTemplate,keyInfo,records,request);
        }
    }

    private void resolve(String line,Map<String,String> keyInfo,HttpServletRequest request) throws Exception {
        if(StringUtils.isBlank(line)) {
            LOGGER.error("锅炉数据有误，传入的数据行为空");
            return;
        }
        if(!line.contains(":")) {
            LOGGER.error("锅炉数据有误，传入的数据行为："+line);
            return;
        }
        int index = line.indexOf(':');
        if(index < 1) {
            LOGGER.error("锅炉数据有误，传入的数据行为："+line);
            return;
        }
        String key = line.substring(0,index);
        String value = line.substring(index+1,line.length());

        keyInfo.put(StringUtils.trim(key), StringUtils.trim(value));
    }
    private void resolve(String line,样品管理 airTemplate,Map<String,String> keyInfo,List<锅炉数据> records,HttpServletRequest request) throws Exception {
        if(StringUtils.isBlank(line)) {
            LOGGER.error("锅炉数据有误，传入的数据行为空");
            return;
        }
        String[] items = line.split("=");
        if(items.length != 2) {
            LOGGER.error("锅炉数据有误，传入的数据行为："+line);
            return;
        }

        //获取锅炉模板
        锅炉模板 boilerTemplate = s锅炉模板SVImpl.queryRecordsFromCache(StringUtils.trim(items[0]));
        if(null == boilerTemplate) {
            LOGGER.error("根据对应项目"+items[0]+"没有查询到锅炉模板数据");
            return;
        }

        锅炉数据 record = new 锅炉数据();
        record.set项目编号(airTemplate.get项目编号());
        record.set点位编号(airTemplate.get点位编号());
        record.set样品编号(airTemplate.get样品编号());
        record.set序号(boilerTemplate.get序号());
        record.set时间段(airTemplate.get时间段());
        record.set项目名称(boilerTemplate.get项目名称());
        record.set检测结果(items[1]);
        record.set方法代码(boilerTemplate.get方法代码());
        record.set单位(boilerTemplate.get单位());
        record.set检测人((String)request.getSession().getAttribute("userName"));
        record.set仪器编号(boilerTemplate.get仪器编号());

        String checkDate = keyInfo.get("测试日期Date");
        String checkTime = keyInfo.get("测试时间Time");
        record.set检测日期(DateUtil.transToDate(checkDate,DateUtil.FORMAT_YYMMDD));
        record.set时间(checkTime);

        records.add(record);
    }

    private String convertSeq(String seqName) throws Exception {
        if("第一次".equals(seqName)) {
            return "1";
        }else if("第二次".equals(seqName)) {
            return "2";
        }else if("第三次".equals(seqName)) {
            return "3";
        }else{
            return "";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/查询锅炉数据", produces = "text/json;charset=UTF-8")
    public String addNewRecord(样品管理 airTemplate) {
        try {
            Map<String, String> cond = new HashMap<String, String>();
            cond.put("项目编号", airTemplate.get项目编号());
            cond.put("点位编号", airTemplate.get点位编号());
            cond.put("样品编号", airTemplate.get样品编号());
            List<锅炉数据> records = s锅炉数据SVImpl.queryRecordsByCond(cond);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到锅炉数据");
            }
            //处理日期格式，注册转换器
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
            return JSONArray.fromObject(records, jsonConfig).toString();
        }catch (Exception e) {
            LOGGER.error("查询锅炉数据异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }
    /************************************************************************************/
    //监测点新增
    @ResponseBody
    @RequestMapping(value="/新增监测点",produces="text/json;charset=UTF-8")
    public String addMonitorPoint(监测点管理 record) {
        try {
            s监测点管理SVImpl.add点位信息(record);
            return ControllerUtil.result(true, "保存监测点成功");
        } catch (Exception e) {
            LOGGER.error("新增监测点异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    //监测点查询
    @ResponseBody
    @RequestMapping(value="/监测点查询",produces="text/json;charset=UTF-8")
    public String queryAir(@RequestParam Map<String,String> param,HttpServletRequest request) {
        try {
            List<监测点管理> records = s监测点管理SVImpl.queryRecordsByCond(param);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到监测点信息");
            }

            //初始化信息上传人员信息
            iniOperName(records,request);

            return JSONArray.fromObject(records).toString();
        }catch (Exception e) {
            LOGGER.error("监测点查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }
    private void iniOperName(List<监测点管理> records,HttpServletRequest request) throws Exception {
        String userName = (String)request.getSession().getAttribute("userName");
        for (监测点管理 record : records) {
            record.set信息上传(userName);
        }

    }

    /************************************************************************************/

    //工况回传
    @ResponseBody
    @RequestMapping(value="/工况回传",produces="text/json;charset=UTF-8")
    public String addOperateMode(工况表 record) {
        try {
            s工况表SVImpl.addRecord(record);
            return ControllerUtil.result(true, "工况回传成功");
        }catch (Exception e) {
            LOGGER.error("工况回传异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }
}
