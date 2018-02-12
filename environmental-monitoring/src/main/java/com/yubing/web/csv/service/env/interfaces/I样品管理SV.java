package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.样品管理;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/2/10.
 */
public interface I样品管理SV {

    void addRecord(样品管理 record) throws Exception;

    List<样品管理> queryRecordsByCond(Map<String,String> cond) throws Exception;

    //查询没有上传的样品管理
    List<样品管理> queryNotUploadRecordsByCond(Map<String,String> cond) throws Exception;

    //更新样品管理
    void modify(Map<String,String> cond,样品管理 record) throws Exception;


}
