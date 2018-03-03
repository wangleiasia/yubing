package com.yubing.web.csv.service.sonar.interfaces;

import com.yubing.web.model.sonar.DeveloperIllegalInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/1.
 */
public interface IDeveloperIllegalInfoSV {

    void saveDeveloperIllegalInfo(DeveloperIllegalInfo record) throws Exception;

    void saveDeveloperIllegalInfos(List<DeveloperIllegalInfo> records) throws Exception;

    List<DeveloperIllegalInfo> queryDeveloperIllegalInfos(Map<String,String> params) throws Exception;

}
