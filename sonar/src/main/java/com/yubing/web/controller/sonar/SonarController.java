package com.yubing.web.controller.sonar;

import com.yubing.util.JsonDateValueProcessor;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.sonar.interfaces.IDeveloperIllegalInfoSV;
import com.yubing.web.csv.service.sonar.interfaces.IIllegalBatchInfoSV;
import com.yubing.web.csv.service.sonar.interfaces.IIllegalCodeInfoSV;
import com.yubing.web.csv.service.sonar.interfaces.IKeyGeneratorSV;
import com.yubing.web.csv.service.sonar.interfaces.ISonarEmployeeSV;
import com.yubing.web.model.sonar.DeveloperIllegalInfo;
import com.yubing.web.model.sonar.IllegalBatchInfo;
import com.yubing.web.model.sonar.IllegalCodeInfo;
import com.yubing.web.model.sonar.SonarEmployee;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/1.
 */
@Controller
public class SonarController {

    private static final Logger LOGGER = Logger.getLogger(SonarController.class);

    public static final String BLOCKER = "BLOCKER";
    public static final String CRITICAL = "CRITICAL";
    public static final String MAJOR = "MAJOR";
    public static final String MINOR = "MINOR";
    public static final String INFO = "INFO";

    @Resource
    private IIllegalCodeInfoSV sIIllegalCodeInfoSVImpl;
    @Resource
    private IKeyGeneratorSV sKeyGeneratorSVImpl;
    @Resource
    private IDeveloperIllegalInfoSV sDeveloperIllegalInfoSVImpl;
    @Resource
    private IIllegalBatchInfoSV sIllegalBatchInfoSVImpl;
    @Resource
    private ISonarEmployeeSV sSonarEmployeeSVImpl;

    @ResponseBody
    @RequestMapping(value = "/illegalCodeUpload", produces = "text/json;charset=UTF-8")
    public String illegalCodeUpload(HttpServletRequest request) throws Exception {
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

                HSSFWorkbook wb = null;
                wb = new HSSFWorkbook(file.getInputStream());
                HSSFSheet sheet = wb.getSheetAt(0);

                LOGGER.debug("sheet name = "+wb.getSheetName(0));

                //违规代码信息
                List<IllegalCodeInfo> illegalCodeInfos = new ArrayList<IllegalCodeInfo>();
                //批次信息
                IllegalBatchInfo illegalBatchInfo = new IllegalBatchInfo();
                //代码违规人员信息
                Map<String,DeveloperIllegalInfo> developerIllegalInfoMap = new HashMap<String, DeveloperIllegalInfo>();

                int batchNumber = sKeyGeneratorSVImpl.getIllegalBatchInfoId();
                illegalBatchInfo.setBatchNumber(batchNumber);
                illegalBatchInfo.setCreateDate(new Date());
                illegalBatchInfo.setState((short)1);

                for(int i = sheet.getFirstRowNum()+1;i<=sheet.getLastRowNum();i++){
                    HSSFRow row = sheet.getRow(i);
                    String illegalLevel = row.getCell(7).getStringCellValue();
                    if(!(SonarController.BLOCKER.equals(illegalLevel) || SonarController.CRITICAL.equals(illegalLevel))) {
                        continue;
                    }

                    IllegalCodeInfo illegalCodeInfo = new IllegalCodeInfo();
                    illegalCodeInfo.setCodeTime(row.getCell(0).getStringCellValue());
                    illegalCodeInfo.setDeveloper(row.getCell(1).getStringCellValue());
                    illegalCodeInfo.setProject(row.getCell(2).getStringCellValue());
                    illegalCodeInfo.setModular(row.getCell(4).getStringCellValue());
                    illegalCodeInfo.setCodeUrl(row.getCell(5).getStringCellValue());
                    illegalCodeInfo.setCodeLine(Integer.parseInt(row.getCell(6).getStringCellValue()));
                    illegalCodeInfo.setIllegalLevel(illegalLevel);
                    illegalCodeInfo.setRuleName(row.getCell(8).getStringCellValue());
                    illegalCodeInfo.setIllegalDescription(row.getCell(9).getStringCellValue());
                    illegalCodeInfo.setRevisingSuggestions1(row.getCell(10).getStringCellValue());
                    illegalCodeInfo.setIllegalLabel(row.getCell(11).getStringCellValue());

                    illegalCodeInfo.setIllegalId(sKeyGeneratorSVImpl.getIllegalCodeInfoId());
                    illegalCodeInfo.setCreateTime(new Date());
                    illegalCodeInfo.setState((short)1);
                    illegalCodeInfo.setBatchNumber(batchNumber);

                    illegalCodeInfos.add(illegalCodeInfo);

                    //进行汇总
                    sIllegalBatchInfoSVImpl.saveIllegalBatchInfo(illegalBatchInfo);
                    summary(batchNumber,illegalCodeInfo,illegalBatchInfo,developerIllegalInfoMap);
                }

                //保存
                if(illegalCodeInfos.size() < 1) {
                    return ControllerUtil.result(true, "文件上传成功");
                }
                sIIllegalCodeInfoSVImpl.saveIllegalCodeInfos(illegalCodeInfos);
                sIllegalBatchInfoSVImpl.saveIllegalBatchInfo(illegalBatchInfo);
                Collection<DeveloperIllegalInfo> values = developerIllegalInfoMap.values();
                List<DeveloperIllegalInfo> developerIllegalInfos = new ArrayList<DeveloperIllegalInfo>(values);
                sDeveloperIllegalInfoSVImpl.saveDeveloperIllegalInfos(developerIllegalInfos);
            }

        }
        long endTime = System.currentTimeMillis();
        LOGGER.info("文件上传消费时间：" + String.valueOf(endTime - startTime) + "ms");

        return ControllerUtil.result(true, "文件上传成功");
    }

    private void summary(int batchNumber, IllegalCodeInfo illegalCodeInfo, IllegalBatchInfo illegalBatchInfo, Map<String, DeveloperIllegalInfo> developerIllegalInfoMap) throws Exception {
        String illegalLevel = illegalCodeInfo.getIllegalLevel();
        if(SonarController.BLOCKER.equals(illegalLevel)) {
            illegalBatchInfo.setBlocker(getValue(illegalBatchInfo.getBlocker())+1);
        }
        if(SonarController.CRITICAL.equals(illegalLevel)) {
            illegalBatchInfo.setCritical(getValue(illegalBatchInfo.getCritical())+1);
        }
        String devName = illegalCodeInfo.getDeveloper();
        if(developerIllegalInfoMap.containsKey(devName)) {
            DeveloperIllegalInfo developerIllegalInfo = developerIllegalInfoMap.get(devName);
            summary(illegalLevel,developerIllegalInfo);
        }else{
            DeveloperIllegalInfo developerIllegalInfo = new DeveloperIllegalInfo();
            developerIllegalInfo.setBatchNumber(batchNumber);
            developerIllegalInfo.setState((short)1);
            developerIllegalInfo.setCreateDate(new Date());
            developerIllegalInfo.setDeveloper(devName);
            summary(illegalLevel,developerIllegalInfo);
            developerIllegalInfoMap.put(devName,developerIllegalInfo);
        }
    }
    private void summary(String illegalLevel,DeveloperIllegalInfo developerIllegalInfo) throws Exception {
        if(SonarController.BLOCKER.equals(illegalLevel)) {
            developerIllegalInfo.setBlocker(getValue(developerIllegalInfo.getBlocker())+1);
        }
        if(SonarController.CRITICAL.equals(illegalLevel)) {
            developerIllegalInfo.setCritical(getValue(developerIllegalInfo.getCritical())+1);
        }
    }

    private int getValue(Integer i) throws Exception {
        if(null == i) {
            return 0;
        }else{
            return i;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/queryBatchInfos", produces = "text/json;charset=UTF-8")
    public String queryBatchInfos() throws Exception {
        List<IllegalBatchInfo> illegalBatchInfos = sIllegalBatchInfoSVImpl.queryIllegalBatchInfosByBatchNumber();
        if(null == illegalBatchInfos) {
            return ControllerUtil.result(false, "没有查询到批次信息");
        }
        //处理日期格式，注册转换器
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        return JSONArray.fromObject(illegalBatchInfos, jsonConfig).toString();
    }

    /**
     * 初始化下拉列表信息
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/initSelect", produces = "text/json;charset=UTF-8")
    public String initSelect(HttpServletRequest request) throws Exception {
        Map<String,Object> result = new HashedMap();

        List<IllegalBatchInfo> illegalBatchInfos = sIllegalBatchInfoSVImpl.queryIllegalBatchInfosByBatchNumber();
        if(null == illegalBatchInfos) {
            //return ControllerUtil.result(false, "没有查询到批次信息");
            result.put("BatchInfo","null");
        }else{
            result.put("BatchInfo",illegalBatchInfos);
        }

        SonarEmployee sonarEmployee = (SonarEmployee)request.getSession().getAttribute("SonarEmployee");
        if("-1".equals(sonarEmployee.getSuperiorLeadership())) {
            //如果当前用户是组长，需要查询组员信息
            Map<String,String> conds = new HashMap<String, String>();
            conds.put("superiorLeadership",sonarEmployee.getDeveloper());
            List<SonarEmployee> sonarEmployees = sSonarEmployeeSVImpl.querySonarEmployees(conds);
            if(null == illegalBatchInfos) {
                //return ControllerUtil.result(false, "没有查询到批次信息");
                result.put("developers","null");
            }else{
                result.put("developers",sonarEmployees);
            }
        }else{
//            List<SonarEmployee> sonarEmployees = new ArrayList<SonarEmployee>();
//            sonarEmployees.add(sonarEmployee);
//            result.put("developers",sonarEmployees);
            result.put("developers","null");
        }

        //处理日期格式，注册转换器
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        return JSONObject.fromObject(result,jsonConfig).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/queryDeveloperIllegalInfos", produces = "text/json;charset=UTF-8")
    public String queryDeveloperIllegalInfos(HttpServletRequest request) throws Exception {
        String batchNumber = request.getParameter("batchNumber");
        String developer = request.getParameter("developer");

        SonarEmployee sonarEmployee = (SonarEmployee)request.getSession().getAttribute("SonarEmployee");

        Map<String,String> params = new HashMap<String, String>();
        params.put("batchNumber",batchNumber);

        if("-1".equals(developer)) {
            if(!"Y".equals(sonarEmployee.getSuperadministratorFlag())) {
                params.put("developer",sonarEmployee.getDeveloper());
            }
        }else{
            params.put("developer",developer);
        }

        List<DeveloperIllegalInfo> developerIllegalInfos = sDeveloperIllegalInfoSVImpl.queryDeveloperIllegalInfos(params);
        if(null == developerIllegalInfos) {
            return ControllerUtil.result(false, "没有查询到违规信息");
        }
        //处理日期格式，注册转换器
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        return JSONArray.fromObject(developerIllegalInfos, jsonConfig).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/queryIllegalCodeInfos", produces = "text/json;charset=UTF-8")
    public String queryIllegalCodeInfos(HttpServletRequest request) throws Exception {
        String batchNumber = request.getParameter("batchNumber");
        String developer = request.getParameter("developer");
        Map<String,String> params = new HashMap<String, String>();
        params.put("batchNumber",batchNumber);
        params.put("developer",developer);
        List<IllegalCodeInfo> illegalCodeInfos = sIIllegalCodeInfoSVImpl.queryIllegalCodeInfos(params);
        if(null == illegalCodeInfos) {
            return ControllerUtil.result(false, "没有查询到违规代码信息");
        }
        //处理日期格式，注册转换器
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        return JSONArray.fromObject(illegalCodeInfos, jsonConfig).toString();
    }

    /**
     * 校验是否有导入权限
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/checkImportEntity", produces = "text/json;charset=UTF-8")
    public String checkImportEntity(HttpServletRequest request) throws Exception {
        SonarEmployee sonarEmployee = (SonarEmployee)request.getSession().getAttribute("SonarEmployee");
        if("Y".equals(sonarEmployee.getSuperadministratorFlag()) || "Y".equals(sonarEmployee.getImportFlag())) {
            return ControllerUtil.result(true, "");
        }else{
            return ControllerUtil.result(false, "您没有导入权限！");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/commitBugSerial", produces = "text/json;charset=UTF-8")
    public String commitBugSerial(HttpServletRequest request) throws Exception {
        int illegalId = Integer.parseInt(request.getParameter("illegalId"));
        String bugSerial = request.getParameter("bugSerial");
        sIIllegalCodeInfoSVImpl.modifyIllegalCodeInfo(illegalId,bugSerial);
        return ControllerUtil.result(false, "提交成功！");
    }

}
