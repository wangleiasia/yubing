package com.yubing.web.controller.env;

import com.yubing.util.DateUtil;
import com.yubing.util.JsonDateValueProcessor;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.env.interfaces.I锅炉数据SV;
import com.yubing.web.csv.service.env.interfaces.I锅炉模板SV;
import com.yubing.web.model.env.锅炉数据;
import com.yubing.web.model.env.锅炉模板;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/2/10.
 */
@Controller
public class BoilerTemplateController {

    private static final Logger LOGGER = Logger.getLogger(BoilerTemplateController.class);

    @Resource
    private I锅炉模板SV s锅炉模板SVImpl;

    @Resource
    private I锅炉数据SV s锅炉数据SVImpl;

    @ResponseBody
    @RequestMapping(value="/queryBoilerTemplate",produces="text/json;charset=UTF-8")
    public String queryBoilerTemplate(@RequestParam Map<String,String> param) {
        try {
            List<锅炉模板> records = s锅炉模板SVImpl.queryRecordsByCond(new HashMap<String, String>());
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到锅炉模板信息");
            }

            //处理日期格式，注册转换器
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());

            return JSONArray.fromObject(records, jsonConfig).toString();
        }catch (Exception e) {
            LOGGER.error("锅炉模板查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value="/saveBoilerResult",produces="text/json;charset=UTF-8")
    public String saveBoilerResult(锅炉数据 record,HttpServletRequest request) {
        try {
            Date now = new Date();

            String checkDate = DateUtil.transTimeToString(now,DateUtil.FORMAT_YYMMDD);
            String checkTime = DateUtil.transTimeToString(now,DateUtil.FORMAT_24HHMMSS);
            record.set检测日期(DateUtil.transToDate(checkDate,DateUtil.FORMAT_YYMMDD));
            record.set时间(checkTime);

            record.set检测人((String)request.getSession().getAttribute("account"));

            s锅炉数据SVImpl.addRecord(record);
            return ControllerUtil.result(true, "保存锅炉数据成功");
        }catch (Exception e) {
            LOGGER.error("保存锅炉数据异常异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }
}
