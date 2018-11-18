package com.yubing.util;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by wanglei on 2017/12/23.
 *
 * 创建时间转换器
 *
 */
public class JsonDateValueProcessor implements JsonValueProcessor{

    private String format ="yyyy-MM-dd";

    public JsonDateValueProcessor() {
        super();
    }

    public JsonDateValueProcessor(String format) {
        super();
        this.format = format;
    }

    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    private Object process(Object value){
        if(value instanceof Date){
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
            return sdf.format(value);
        }
        return value == null ? "" : value.toString();
    }
}
