package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.监测点管理;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/19.
 */
public interface I监测点管理SV {

    //新增加点位信息
    void add点位信息(监测点管理 record) throws Exception;

    List<监测点管理> queryRecordsByCond(Map<String,String> cond) throws Exception;

    void modify(String prjCoce,String pointCode,监测点管理 record) throws Exception;

}
