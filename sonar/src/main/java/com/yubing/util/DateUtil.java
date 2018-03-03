package com.yubing.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wanglei on 2018/1/14.
 */
public class DateUtil {

    public final static String FORMAT_YYMMDD = "yyyy-MM-dd";
    public final static String FORMAT_YYYYMMDD24HHMMSS = "yyyy-MM-dd HH:mm:ss";
    public final static String FORMAT_NOLINE_YYMMDD = "yyyyMMdd";
    public final static String FORMAT_NOLINE_YYYYMMDD24HHMMSS = "yyyyMMddHHmmss";
    public final static String FORMAT_NOLINE_YYYYMMDD24HHMMSSSSS = "yyyyMMddHHmmssSSS";
    public final static String FORMAT_NOLINE_YYYYMMDD24HHMM = "yyyyMMddHHmm";
    public final static String FORMAT_24HHMMSS = "HH:mm:ss";
    public final static String FORMAT_24HHMMSS_NO = "HHmmss";
    public final static String FORMAT_YYMM = "yyMM";
    public final static String FORMAT_YYYYMM = "yyyyMM";
    public final static String FOREVER_DATE_LINE = "2099-12-31 23:59:59";
    public final static String FOREVER_DATE_NOLINE = "20991231235959";
    public final static String FORMAT_YYYY = "yyyy";
    public final static String FORMAT_MM = "MM";
    public final static String FORMAT_DD = "dd";
    public final static String FORMAT_HH = "HH";
    public final static String FORMAT_mm = "mm";

    public static String transTimeToString(Date date,String formate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        return sdf.format(date);
    }

    public static Date transToDate(String date,String formate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        return sdf.parse(date);
    }

}
