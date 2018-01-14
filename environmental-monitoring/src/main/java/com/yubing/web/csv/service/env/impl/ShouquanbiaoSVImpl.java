package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.IShouquanbiaoDAO;
import com.yubing.web.csv.service.env.interfaces.IShouquanbiaoSV;
import com.yubing.web.model.env.shouquanbiao;
import com.yubing.web.model.env.shouquanbiaoExample;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/1/13.
 */
@Service(value="sShouquanbiaoSVImpl")
public class ShouquanbiaoSVImpl implements IShouquanbiaoSV {

    @Resource
    IShouquanbiaoDAO iShouquanbiaoDAO;

    public shouquanbiao queryRecordByCond(Map<String, String> cond) throws Exception {
        shouquanbiaoExample example = new shouquanbiaoExample();
        shouquanbiaoExample.Criteria c = example.or();
        if(StringUtils.isNotBlank(cond.get("账户"))) {
            String userName = cond.get("账户");
            c.and账户EqualTo(userName);
        }else{
            return null;
        }
        if(StringUtils.isNotBlank(cond.get("密码"))) {
            c.and密码EqualTo(cond.get("密码"));
        }
        List<shouquanbiao> records = iShouquanbiaoDAO.selectByExample(example);
        if(null == records || records.size() < 1) {
            return null;
        }else{
            return records.get(0);
        }
    }
}
