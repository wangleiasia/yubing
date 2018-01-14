package com.yubing.util;

import org.apache.commons.collections.MapUtils;

import java.util.Map;

/**
 * Created by wanglei on 2017/11/13.
 */
public class CollectionUtil {

    /**从Map中取值*/
    public static String getValueFromMap(Map map,String key,String defaultValue) throws Exception {
        if(MapUtils.isEmpty(map)) {
            return defaultValue;
        }
        if(map.containsKey(key)) {
            return (String)map.get(key);
        }else{
            return defaultValue;
        }
    }

}
