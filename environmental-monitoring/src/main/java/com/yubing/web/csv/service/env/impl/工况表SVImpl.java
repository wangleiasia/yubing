package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I工况表DAO;
import com.yubing.web.csv.service.env.interfaces.I工况表SV;
import com.yubing.web.model.env.工况表;
import com.yubing.web.model.env.工况表Example;
import com.yubing.web.model.env.样品管理Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public List<工况表> queryRecordsByCond(String xmbh, String dwbh) throws Exception {
        工况表Example example = new 工况表Example() ;
        工况表Example.Criteria c = example.or();
        c.and项目编号EqualTo(xmbh);
        c.and点位编号EqualTo(dwbh);
        return i工况表DAO.selectByExample(example);
    }
}
