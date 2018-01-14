package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.设备台账;

import java.util.List;

/**
 * Created by wanglei on 2018/1/14.
 */
public interface I设备台账SV {

    /**
     * 根据设备列别，查询设备信息
     * @param categorys
     * @return
     * @throws Exception
     */
    public List<设备台账> queryRecordsByCond(List<String> categorys) throws Exception;

}
