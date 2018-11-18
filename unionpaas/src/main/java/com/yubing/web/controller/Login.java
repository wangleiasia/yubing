package com.yubing.web.controller;

import com.yubing.constant.UnionPaasConstant;
import com.yubing.web.csv.service.sonar.interfaces.ISonarEmployeeSV;
import com.yubing.web.model.sonar.SonarEmployee;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    @Resource
    private JedisPool jedisPool;

    @Value("#{unionPaasConfig.session_keep_long}")
    private int sessionKeepLong;

    @ResponseBody
    @RequestMapping(value="/login",produces="text/json;charset=UTF-8")
    public String login(HttpServletRequest request) {

        if(!UnionPaasConstant.SAVE_SESSION_IN_REDIS) {
            SonarEmployee sonarEmployee = new SonarEmployee();
            sonarEmployee.setDeveloper("wanglei6");
            sonarEmployee.setPassword("123456");
            sonarEmployee.setSuperadministratorFlag("Y");
            sonarEmployee.setSuperiorLeadership("-1");
            sonarEmployee.setImportFlag("Y");
            sonarEmployee.setState((short)1);
            request.getSession().setAttribute("SonarEmployee",sonarEmployee);
            return ControllerUtil.result(true, "登录成功");
        }

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

            //保存统一会话
            Jedis jedis = null;
            try {
                jedis = jedisPool.getResource();
                String sessionId = request.getSession().getId();
                jedis.set(sessionId,userName+"|"+password);
                //更新生存时间
                jedis.expire(sessionId,sessionKeepLong);
            }catch (Exception e) {
                LOGGER.error("保存统一会话异常",e);
            }finally {
                if(jedis != null) {
                    jedis.close();
                }
            }

            return ControllerUtil.result(true, "登录成功");
        }catch (Exception e) {
            LOGGER.error("登录异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value="/logout",produces="text/json;charset=UTF-8")
    public String logout(Map<String,String> param, HttpServletRequest request, HttpServletResponse response) {

        if(!UnionPaasConstant.SAVE_SESSION_IN_REDIS) {
            request.getSession().removeAttribute("isLogin");
            request.getSession().removeAttribute("userName");
            request.getSession().removeAttribute("SonarEmployee");
            String loginURL= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
            try {
                response.sendRedirect(loginURL);
            } catch (IOException e) {
                LOGGER.error(e);
            }
            return ControllerUtil.result(true, "注销成功");
        }

        try {
            //保存统一会话
            Jedis jedis = null;
            try {
                jedis = jedisPool.getResource();
                String sessionId = request.getSession().getId();
                //更新生存时间
                jedis.del(sessionId);
            }catch (Exception e) {
                LOGGER.error("删除统一会话异常",e);
            }finally {
                if(jedis != null) {
                    jedis.close();
                }
            }

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

        if(!UnionPaasConstant.SAVE_SESSION_IN_REDIS) {
            return ControllerUtil.result(true, "Admin");
        }

        try {
            String userName = (String)request.getSession().getAttribute("userName");
            return ControllerUtil.result(true, userName);
        }catch (Exception e) {
            LOGGER.error("获取用户名异常",e);
            return ControllerUtil.result(false, e.getMessage());
        }
    }

}
