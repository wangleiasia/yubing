package com.yubing.web.csv.service.env.interfaces;

import com.yubing.web.model.env.检测依据;

import java.util.List;

/**
 * Created by wanglei on 2018/1/14.
 */
public interface I检测依据SV {

    /**
     * 根据类别查询方法代码
     * @param categorys
     * @return
     * @throws Exception
     */
    List<检测依据> queryRecordsByCategorys(List<String> categorys) throws Exception;

}
