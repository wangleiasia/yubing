package com.yubing.web.csv.service.devops.config.interfaces;

import com.yubing.web.model.devops.config.DevopsConfigInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/11/20.
 */
public interface IDevopsConfigInfoSV {

    void saveDevopsConfigInfo(DevopsConfigInfo record) throws Exception;

    List<DevopsConfigInfo> queryRecordsByCond(Map<String, String> cond) throws Exception;

    void deleteRecordById(long id) throws Exception;

    void modify(DevopsConfigInfo record) throws Exception;

}
