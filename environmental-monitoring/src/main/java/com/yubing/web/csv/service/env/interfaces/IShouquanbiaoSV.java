package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.shouquanbiao;

import java.util.Map;

/**
 * Created by wanglei on 2018/1/13.
 */
public interface IShouquanbiaoSV {

     shouquanbiao queryRecordByCond(Map<String,String> cond) throws Exception;

}
