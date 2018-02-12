package com.yubing.web.controller.env;

import com.yubing.web.constant.EnvMonitorConstant;
import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.env.interfaces.I监测点管理SV;
import com.yubing.web.csv.service.env.interfaces.I设备台账SV;
import com.yubing.web.model.env.监测点管理;
import com.yubing.web.model.env.设备台账;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/1/14.
 */
@Controller
public class PointManageController {

    private static final Logger LOGGER = Logger.getLogger(PointManageController.class);

    @Resource
    private I监测点管理SV s监测点管理SVImpl;
    @Resource
    private I设备台账SV s设备台账SVImpl;

    //点位信息管理页面打开时页面初始化
    @ResponseBody
    @RequestMapping(value="/pointManage/noisePageInit",produces="text/json;charset=UTF-8")
    public String noisePageInit(HttpServletRequest request) {
        try {
            List<监测点管理> records = queryPointInfoByAccount(request);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到该账户的监测点信息");
            }
            for (int i = 0; i < records.size(); i++) {
                String category = records.get(i).get类别();
                if(StringUtils.isEmpty(category)) {
                    records.remove(i);
                    i--;
                    continue;
                }
                if(!(EnvMonitorConstant.ZAOSHENG.equals(category) || EnvMonitorConstant.ZHENDONG.equals(category))) {
                    records.remove(i);
                    i--;
                    continue;
                }
            }
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到该账户的监测点信息");
            }
            Map result = new HashMap();
            recordsResolver(records,result);
            return JSONObject.fromObject(result).toString();
        }catch (Exception e) {
            LOGGER.error("监测点查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    //大气点位信息管理页面打开时页面初始化
    @ResponseBody
    @RequestMapping(value="/pointManage/airPointManagePageInit",produces="text/json;charset=UTF-8")
    public String airPointManagePageInit(HttpServletRequest request) {
        try {
            List<监测点管理> records = queryPointInfoByAccount(request);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到该账户的监测点信息");
            }
            for (int i = 0; i < records.size(); i++) {
                String category = records.get(i).get类别();
                if(StringUtils.isEmpty(category)) {
                    records.remove(i);
                    i--;
                    continue;
                }
                if(!EnvMonitorConstant.GUOLU.equals(category)) {
                    records.remove(i);
                    i--;
                    continue;
                }
            }
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到该账户的监测点信息");
            }
            Map result = new HashMap();
            recordsResolver(records,result);
            return JSONObject.fromObject(result).toString();
        }catch (Exception e) {
            LOGGER.error("监测点查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    private List<监测点管理> queryPointInfoByAccount(HttpServletRequest request) throws Exception {
        String account = (String)request.getSession().getAttribute("account");
        Map<String,String> cond = new HashMap<String, String>();
        cond.put("授权账户",account);
        cond.put("执行状态", EnvMonitorConstant.POINT_MANAGER_STATE_N);
        return s监测点管理SVImpl.queryRecordsByCond(cond);
    }

    /**
     * 组装成约定的数据格式
     * @param records
     * @param result
     * @throws Exception
     */
    private void recordsResolver(List<监测点管理> records,Map result) throws Exception {
        Map<String,List<String>> prjMap = new HashMap<String, List<String>>();
        for (int i = 0; i < records.size(); i++) {
            监测点管理 record = records.get(i);
            String prjCode = record.get项目编号();
            String pointCode = record.get点位编号();
            if(prjMap.containsKey(prjCode)) {
                prjMap.get(prjCode).add(pointCode);
            }else{
                List<String> pointList = new ArrayList<String>();
                pointList.add(pointCode);
                prjMap.put(prjCode,pointList);
            }
        }
        List<String> prjList = new ArrayList<String>();
        prjList.addAll(prjMap.keySet());
        result.put("项目信息",prjList);
        result.put("点位信息",prjMap);
    }

    //监测点修改
    @ResponseBody
    @RequestMapping(value="/修改监测点",produces="text/json;charset=UTF-8")
    public String modfyMonitorPoint(监测点管理 record) {
        try {
            //先根据项目编号和检测点查询信息
            Map<String, String> cond = new HashMap<String, String>();
            cond.put("项目编号", record.get项目编号());
            cond.put("点位编号", record.get点位编号());
            List<监测点管理> records = s监测点管理SVImpl.queryRecordsByCond(cond);
            if (null == records || records.size() < 1) {
                String errorMsg = "根据项目编号[" + record.get项目编号() + "]，点位编号[" + record.get点位编号() + "]没有查询到监测点信息";
                return ControllerUtil.result(false, errorMsg);
            }
            if (records.size() > 1) {
                String errorMsg = "根据项目编号[" + record.get项目编号() + "]，点位编号[" + record.get点位编号() + "]查询出的点位信息大于1";
                return ControllerUtil.result(false, errorMsg);
            }
            //开始更新点位信息
            //String ld = record.getLd();
            s监测点管理SVImpl.modify(record.get项目编号(), record.get点位编号(), record);
            return ControllerUtil.result(true, "监测点修改成功");
        }catch (Exception e) {
            LOGGER.error("修改监测点异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    //监测点查询
    @ResponseBody
    @RequestMapping(value="/queryUserPointMangage",produces="text/json;charset=UTF-8")
    public String queryUserPointMangage(HttpServletRequest request) {
        try {
            String userName = (String)request.getSession().getAttribute("userName");
            Map<String,String> cond = new HashMap<String, String>();
            cond.put("监测人员",userName);
            List<监测点管理> records = s监测点管理SVImpl.queryRecordsByCond(cond);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到监测点信息");
            }
            return JSONArray.fromObject(records).toString();
        }catch (Exception e) {
            LOGGER.error("监测点查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    //噪声设备信息查询
    @ResponseBody
    @RequestMapping(value="/pointManage/queryEquipmentForNoise",produces="text/json;charset=UTF-8")
    public String queryEquipmentForNoise() {
        try {
            List<String> cond = new ArrayList<String>();
            cond.add(EnvMonitorConstant.ZAOSHENG);
            cond.add(EnvMonitorConstant.ZHENDONG);
            List<设备台账> records = s设备台账SVImpl.queryRecordsByCond(cond);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到设备信息");
            }
            return JSONArray.fromObject(records).toString();
        }catch (Exception e) {
            LOGGER.error("监测点查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    //噪声设备信息查询
    @ResponseBody
    @RequestMapping(value="/pointManage/queryEquipmentForAir",produces="text/json;charset=UTF-8")
    public String queryEquipmentForAir() {
        try {
            List<String> cond = new ArrayList<String>();
            cond.add(EnvMonitorConstant.AIRCATEGORY);
            List<设备台账> records = s设备台账SVImpl.queryRecordsByCond(cond);
            if (null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到设备信息");
            }
            return JSONArray.fromObject(records).toString();
        }catch (Exception e) {
            LOGGER.error("监测点查询异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

}
