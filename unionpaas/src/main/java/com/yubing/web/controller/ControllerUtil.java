package com.yubing.web.controller;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/16.
 */
public class ControllerUtil {

    public static String result(boolean bResult,String desc) {
        Map<String,String> result = new HashMap<String,String>();
        if(bResult) {
            result.put("result","true");
        }else{
            result.put("result","false");
        }
        if(StringUtils.isNotBlank(desc)) {
            result.put("message",desc);
        }else{
            result.put("message","");
        }
        return JSONObject.fromObject(result).toString();
    }

}
