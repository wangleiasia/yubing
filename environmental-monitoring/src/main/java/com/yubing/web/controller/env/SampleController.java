package com.yubing.web.controller.env;

import com.yubing.util.JsonDateValueProcessor;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.env.interfaces.I大气样品SV;
import com.yubing.web.csv.service.env.interfaces.I样品管理SV;
import com.yubing.web.model.env.大气样品;
import com.yubing.web.model.env.样品管理;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/2/10.
 */
@Controller
public class SampleController {
    private static final Logger LOGGER = Logger.getLogger(SampleController.class);

    @Resource
    private I样品管理SV s样品管理SVImpl;

    @Resource
    private I大气样品SV s大气样品SVImpl;

    @ResponseBody
    @RequestMapping(value="/样品查询",produces="text/json;charset=UTF-8")
    public String querySample(@RequestParam Map<String,String> param) {
        try {
            List<样品管理> records = s样品管理SVImpl.queryNotUploadRecordsByCond(param);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到大气样品信息");
            }

            //处理日期格式，注册转换器
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());

            return JSONArray.fromObject(records, jsonConfig).toString();
        }catch (Exception e) {
            LOGGER.error("样品管理查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value="/大气样品查询",produces="text/json;charset=UTF-8")
    public String queryMonitorPoint(@RequestParam Map<String,String> param) {
        try {
            List<大气样品> records = s大气样品SVImpl.queryNotUploadRecordsByCond(param);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到大气样品信息");
            }

            //处理日期格式，注册转换器
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());

            return JSONArray.fromObject(records, jsonConfig).toString();
        }catch (Exception e) {
            LOGGER.error("大气样品查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }
}
