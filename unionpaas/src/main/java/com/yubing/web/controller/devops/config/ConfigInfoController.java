package com.yubing.web.controller.devops.config;

import com.yubing.util.JsonDateValueProcessor;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.devops.config.interfaces.IDevopsConfigInfoSV;
import com.yubing.web.model.devops.config.DevopsConfigInfo;
import com.yubing.web.util.ExcleUtil;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/11/20.
 */
@Controller
public class ConfigInfoController {

    private static final Logger LOGGER = Logger.getLogger(ConfigInfoController.class);

    @Resource
    private IDevopsConfigInfoSV sDevopsConfigInfoSVImpl;

    @ResponseBody
    @RequestMapping(value = "/saveConfigInfo", produces = "text/json;charset=UTF-8")
    public String saveConfigInfo(DevopsConfigInfo value,HttpServletRequest request) throws Exception {
        List<DevopsConfigInfo> infos = new ArrayList<DevopsConfigInfo>();

        value.setConfigStatus((short)0);
        value.setCreateDate(new Date());
        sDevopsConfigInfoSVImpl.saveDevopsConfigInfo(value);

        infos.add(value);

        //处理日期格式，注册转换器
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        return JSONArray.fromObject(infos, jsonConfig).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/queryConfigInfo", produces = "text/json;charset=UTF-8")
    public String queryConfigInfo(@RequestParam Map<String,String> param, HttpServletRequest request) throws Exception {
        List<DevopsConfigInfo> infos = sDevopsConfigInfoSVImpl.queryRecordsByCond(param);

        //处理日期格式，注册转换器
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        return JSONArray.fromObject(infos, jsonConfig).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/deleteConfigInfo", produces = "text/json;charset=UTF-8")
    public String deleteConfigInfo(@RequestParam Map<String,String> param, HttpServletRequest request) throws Exception {

        long configId = Long.valueOf(param.get("configId"));
        sDevopsConfigInfoSVImpl.deleteRecordById(configId);

        return ControllerUtil.result(true, "删除成功！");
    }

    //@RequestParam("id") String id
    //导出
    @ResponseBody
    @RequestMapping(value = "/exportConfigInfo", produces = "text/json;charset=UTF-8")
    public String exportConfigInfo(@RequestParam Map<String,String> param, HttpServletResponse response) throws Exception {

        List<DevopsConfigInfo> infos = sDevopsConfigInfoSVImpl.queryRecordsByCond(param);

        try{
            ExcleUtil.export("config_info_export.json", infos,response);
            return ControllerUtil.result(true, "删除成功！");
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }


    }

}
