package com.yubing.web.controller;

import com.yubing.util.ObjectConverter;
import com.yubing.web.csv.service.env.interfaces.IShouquanbiaoSV;
import com.yubing.web.csv.service.env.interfaces.I监测点管理SV;
import com.yubing.web.model.env.shouquanbiao;
import com.yubing.web.model.env.监测点管理;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/23.
 */
@Controller
public class Login {

    private static final Logger LOGGER = Logger.getLogger(Login.class);

    @Resource
    private I监测点管理SV s监测点管理SVImpl;

    @Resource
    private IShouquanbiaoSV sShouquanbiaoSVImpl;

    @ResponseBody
    @RequestMapping(value="/login",produces="text/json;charset=UTF-8")
    public String loginNew(HttpServletRequest request) {
        try {
            String userName = request.getParameter("userName");
            Map<String,String> cond = new HashMap<String, String>();
            cond.put("账户",userName);
            shouquanbiao record = sShouquanbiaoSVImpl.queryRecordByCond(cond);
            if(null == record) {
                return ControllerUtil.result(false, "用户不存在！");
            }

            request.getSession().setAttribute("isLogin","true");
            request.getSession().setAttribute("userName", ObjectConverter.converteString(record.get姓名()));
            request.getSession().setAttribute("account",userName);
            return ControllerUtil.result(true, "登录成功");
        }catch (Exception e) {
            LOGGER.error("登录异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value="/loginOld",produces="text/json;charset=UTF-8")
    public String login(HttpServletRequest request) {
        try {
            String userName = request.getParameter("userName");
            Map<String,String> cond = new HashMap<String, String>();
            cond.put("监测人员",userName);
            List<监测点管理> records = s监测点管理SVImpl.queryRecordsByCond(cond);
            if(null == records || records.size() < 1) {
                return ControllerUtil.result(false, "没有查询到用户的监测点位信息！");
            }

            request.getSession().setAttribute("isLogin","true");
            request.getSession().setAttribute("userName",userName);
            return ControllerUtil.result(true, "登录成功");
        }catch (Exception e) {
            LOGGER.error("登录异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value="/logout",produces="text/json;charset=UTF-8")
    public String logout(Map<String,String> param, HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getSession().removeAttribute("isLogin");
            request.getSession().removeAttribute("userName");
            request.getSession().removeAttribute("account");
            String loginURL= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
            response.sendRedirect(loginURL);
            return ControllerUtil.result(true, "注销成功");
        }catch (Exception e) {
            LOGGER.error("注销异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value="/getLoginName",produces="text/json;charset=UTF-8")
    public String getLoginName(Map<String,String> param, HttpServletRequest request, HttpServletResponse response) {
        try {
            String userName = (String)request.getSession().getAttribute("userName");
            String account = (String)request.getSession().getAttribute("account");
            String returnInf = account+"["+userName+"]";
            return ControllerUtil.result(true, returnInf);
        }catch (Exception e) {
            LOGGER.error("获取用户名异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

}
