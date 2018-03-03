package com.yubing.web.controller;

import com.yubing.web.csv.service.sonar.interfaces.ISonarEmployeeSV;
import com.yubing.web.model.sonar.SonarEmployee;
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
    private ISonarEmployeeSV sSonarEmployeeSVImpl;

    @ResponseBody
    @RequestMapping(value="/login",produces="text/json;charset=UTF-8")
    public String login(HttpServletRequest request) {
        try {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            Map<String,String> conds = new HashMap<String, String>();
            conds.put("developer",userName);
            conds.put("password",password);
            List<SonarEmployee> sonarEmployees = sSonarEmployeeSVImpl.querySonarEmployees(conds);
            if(null == sonarEmployees || sonarEmployees.size() < 1) {
                return ControllerUtil.result(false, "输入的用户名或密码不正确，请重新输入！");
            }
            SonarEmployee sonarEmployee = sonarEmployees.get(0);

            request.getSession().setAttribute("isLogin","true");
            request.getSession().setAttribute("userName", userName);

            request.getSession().setAttribute("SonarEmployee",sonarEmployee);

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
            request.getSession().removeAttribute("SonarEmployee");
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
            return ControllerUtil.result(true, userName);
        }catch (Exception e) {
            LOGGER.error("获取用户名异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

}
