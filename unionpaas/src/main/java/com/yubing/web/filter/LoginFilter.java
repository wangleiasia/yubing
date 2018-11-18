package com.yubing.web.filter;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by wanglei on 2017/11/12.
 */
public class LoginFilter implements Filter {

    private static final Logger LOGGER = Logger.getLogger(LoginFilter.class);

    private static List<String> allowPathList = new ArrayList<String>();

    private JedisPool jedisPool = null;

    private Properties properties = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        String allowPathStr = filterConfig.getInitParameter("allow-path");
        if(StringUtils.isBlank(allowPathStr)) {
            return;
        }
        String[] items = allowPathStr.split(";");
        for (String item : items) {
            allowPathList.add(item);
        }

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(filterConfig.getServletContext());
        jedisPool = (JedisPool)context.getBean("jedisPool");
        properties = (Properties)context.getBean("unionPaasConfig");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String uri = request.getRequestURI();
        if("/".equals(uri) || uri.contains("login") || uri.contains("logout") || isAllow(uri)) {
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        //Object obj = request.getSession().getAttribute("isLogin");
        //if(null == obj || "false".equals((String)obj)) {
        if(!isLogin(request)) {
            //如果没有登录，返回登录页面
            String loginURL= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
            response.sendRedirect(loginURL);
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    private boolean isAllow(String requestUri) {
        try {
            String allowPath = "";
            for (int i = 0; i < allowPathList.size(); i++) {
                allowPath = allowPathList.get(i);
                if (allowPath.startsWith("*")) {
                    allowPath = allowPath.substring(1);
                    if (requestUri.toLowerCase().endsWith(allowPath.toLowerCase())) {
                        return true;
                    }
                } else {
                    if (requestUri.startsWith(allowPath)) {
                        return true;
                    }
                }
            }
            return false;
        }catch (Exception e) {
            LOGGER.error("校验用户登录异常",e);
            return false;
        }
    }

    private boolean isLogin(HttpServletRequest request) {
        boolean bResult = false;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            //生成新的会话ID
            String sessionId = request.getSession().getId();
            String loginValue = jedis.get(sessionId);
            if(StringUtils.isNotBlank(loginValue)) {
                bResult = true;
            }else{
                String str = properties.getProperty("session_keep_long");
                jedis.expire(sessionId,Integer.parseInt(str));
            }
        }catch (Exception e) {
            LOGGER.error("校验用户是否登录异常",e);
        }finally {
            if(jedis != null) {
                jedis.close();
            }
            return bResult;
        }
    }

    public void destroy() {

    }
}
