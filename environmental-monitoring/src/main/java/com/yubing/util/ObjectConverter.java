package com.yubing.util;

/**
 * Created by wanglei on 2018/1/13.
 */
public class ObjectConverter {

    public static String converteString(String string) {
        try {
            if(null == string) {
                return "";
            }else{
                return string;
            }
        }catch (Exception e) {
            return "";
        }
    }

}
