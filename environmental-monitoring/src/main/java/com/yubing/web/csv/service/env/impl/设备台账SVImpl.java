package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I设备台账DAO;
import com.yubing.web.csv.service.env.interfaces.I设备台账SV;
import com.yubing.web.model.env.设备台账;
import com.yubing.web.model.env.设备台账Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wanglei on 2018/1/14.
 */
@Service(value="s设备台账SVImpl")
public class 设备台账SVImpl implements I设备台账SV {

    @Resource
    private I设备台账DAO i设备台账DAO;

    public List<设备台账> queryRecordsByCond(List<String> categorys) throws Exception {
        设备台账Example example = new 设备台账Example();
        设备台账Example.Criteria c = example.or();
        c.and类别In(categorys);
        return i设备台账DAO.selectByExample(example);
    }

}
