package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.工况表;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/20.
 */
public interface I工况表SV {

    void addRecord(工况表 record) throws Exception;

    List<工况表> queryRecordsByCond(String xmbh,String dwbh) throws Exception;

}
