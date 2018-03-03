package com.yubing.util;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wanglei on 2017/12/23.
 * <p>
 * 日期类型的转换器，用于前端页面为日期字符串到后端映射场景
 */
public class DateConverter implements Converter<String, Date> {

    private static final Logger LOGGER = Logger.getLogger(DateConverter.class);

    public Date convert(String s) {
        if(StringUtils.isBlank(s)) {
            return new Date();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(s);
        } catch (Exception e) {
            LOGGER.error("日期格式转换错误",e);
        }
        return null;
    }
}
