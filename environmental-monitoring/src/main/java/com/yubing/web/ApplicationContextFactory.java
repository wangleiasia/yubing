package com.yubing.web;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanglei on 2017/11/16.
 */
public class ApplicationContextFactory {

    private static AbstractApplicationContext applicationContext = null;

    public static AbstractApplicationContext getApplicationContext() {
        if(null == applicationContext) {
            synchronized (AbstractApplicationContext.class) {
                if(null == applicationContext) {
                    applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
                }
            }
        }
        return applicationContext;
    }

}
