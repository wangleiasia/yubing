package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I监测点管理DAO;
import com.yubing.web.csv.service.env.interfaces.I监测点管理SV;
import com.yubing.web.model.env.监测点管理;
import com.yubing.web.model.env.监测点管理Example;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/19.
 */
@Service(value="s监测点管理SVImpl")
public class 监测点管理SVImpl implements I监测点管理SV {

    @Resource
    I监测点管理DAO i监测点管理DAO;

    public void add点位信息(监测点管理 record) throws Exception {
        //补充默认上传时间
        record.set上传时间(new Date());
        //处理默认的任务单号
        record.set任务单号("122");
        i监测点管理DAO.insert(record);
    }

    public List<监测点管理> queryRecordsByCond(Map<String, String> cond) throws Exception {
        监测点管理Example example = new 监测点管理Example() ;
        监测点管理Example.Criteria c = example.or();

        if(StringUtils.isNotBlank(cond.get("项目编号"))) {
            c.and项目编号EqualTo(cond.get("项目编号"));
        }
        if(StringUtils.isNotBlank(cond.get("点位编号"))) {
            c.and点位编号EqualTo(cond.get("点位编号"));
        }
        if(StringUtils.isNotBlank(cond.get("监测人员"))) {
            c.and监测人员EqualTo(cond.get("监测人员"));
        }
        if(StringUtils.isNotBlank(cond.get("口令"))) {
            c.and口令EqualTo(cond.get("口令"));
        }
        if(StringUtils.isNotBlank(cond.get("密码"))) {
            c.and密码EqualTo(cond.get("密码"));
        }

        return i监测点管理DAO.selectByExample(example);
    }

    public void modify(String prjCoce,String pointCode,监测点管理 record) throws Exception {
        监测点管理Example example = new 监测点管理Example() ;
        监测点管理Example.Criteria c = example.or();
        c.and项目编号EqualTo(prjCoce);
        c.and点位编号EqualTo(pointCode);
        i监测点管理DAO.updateByExampleSelective(record,example);
    }

}
