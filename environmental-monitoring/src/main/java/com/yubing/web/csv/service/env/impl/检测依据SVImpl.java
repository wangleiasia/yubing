package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I检测依据DAO;
import com.yubing.web.csv.service.env.interfaces.I检测依据SV;
import com.yubing.web.model.env.检测依据;
import com.yubing.web.model.env.检测依据Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wanglei on 2018/1/14.
 */
@Service(value="s检测依据SVImpl")
public class 检测依据SVImpl implements I检测依据SV {

    @Resource
    private I检测依据DAO i检测依据DAO;

    public List<检测依据> queryRecordsByCategorys(List<String> categorys) throws Exception {
        检测依据Example example = new 检测依据Example();
        检测依据Example.Criteria c = example.or();
        c.and类别In(categorys);
        return i检测依据DAO.selectByExample(example);
    }
}
