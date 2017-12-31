package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I现场噪声监测记录DAO;
import com.yubing.web.csv.service.env.interfaces.I现场噪声监测记录SV;
import com.yubing.web.model.env.现场噪声监测记录;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wanglei on 2017/12/16.
 */
@Service(value="s现场噪声监测记录SVImpl")
public class 现场噪声监测记录SVImpl implements I现场噪声监测记录SV {

    @Resource
    I现场噪声监测记录DAO i现场噪声监测记录DAO;

    public void add现场噪声监测记录(现场噪声监测记录 record) {
        i现场噪声监测记录DAO.insert(record);
    }
}
