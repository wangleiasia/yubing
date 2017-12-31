package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I工况表DAO;
import com.yubing.web.csv.service.env.interfaces.I工况表SV;
import com.yubing.web.model.env.工况表;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wanglei on 2017/12/20.
 *
 * 锅炉工况
 *
 */
@Service(value="s工况表SVImpl")
public class 工况表SVImpl implements I工况表SV {

    @Resource
    I工况表DAO i工况表DAO;

    public void addRecord(工况表 record) throws Exception {
        i工况表DAO.insert(record);
    }
}
