package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.锅炉模板;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/20.
 */
public interface I锅炉模板SV {

    void addRecord(锅炉模板 record) throws Exception;

    List<锅炉模板> queryRecordsByCond(Map<String,String> cond) throws Exception;

    锅炉模板 queryRecordsFromCache(String toPrj) throws Exception;

}
