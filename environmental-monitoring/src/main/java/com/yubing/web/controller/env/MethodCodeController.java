package com.yubing.web.controller.env;

import com.yubing.web.constant.EnvMonitorConstant;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.env.interfaces.I检测依据SV;
import com.yubing.web.model.env.检测依据;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglei on 2018/1/14.
 *
 *
 * 检测依据相关
 *
 */
@Controller
public class MethodCodeController {

    private static final Logger LOGGER = Logger.getLogger(MethodCodeController.class);

    @Resource
    private I检测依据SV s检测依据SVImpl;

    /**
     * 方法代码查询，只查询噪声和震动
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/methodCode/queryMethodCodes",produces="text/json;charset=UTF-8")
    public String queryMethodCodes(HttpServletRequest request) {
        try {
            List<String> conds = new ArrayList<String>();
            conds.add(EnvMonitorConstant.ZHENDONG);
            conds.add(EnvMonitorConstant.ZAOSHENG);
            List<检测依据> records = s检测依据SVImpl.queryRecordsByCategorys(conds);
            if(null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到方法代码");
            }
            return JSONArray.fromObject(records).toString();
        }catch (Exception e) {
            LOGGER.error("检测依据查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }
}
