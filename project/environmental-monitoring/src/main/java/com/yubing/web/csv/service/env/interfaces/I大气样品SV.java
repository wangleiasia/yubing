package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.大气样品;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/23.
 */
public interface I大气样品SV {

    void addRecord(大气样品 record) throws Exception;

    List<大气样品> queryRecordsByCond(Map<String,String> cond) throws Exception;

}
