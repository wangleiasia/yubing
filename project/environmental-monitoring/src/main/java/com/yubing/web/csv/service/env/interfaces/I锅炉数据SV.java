package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.锅炉数据;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/20.
 */
public interface I锅炉数据SV {

    void addRecord(锅炉数据 record) throws Exception;

    void addRecords(List<锅炉数据> records) throws Exception;

    List<锅炉数据> queryRecordsByCond(Map<String,String> cond) throws Exception;


}
