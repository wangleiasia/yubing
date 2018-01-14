package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I大气样品DAO;
import com.yubing.web.csv.service.env.interfaces.I大气样品SV;
import com.yubing.web.model.env.大气样品;
import com.yubing.web.model.env.大气样品Example;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/23.
 */
@Service(value="s大气样品SVImpl")
public class 大气样品SVImpl implements I大气样品SV {

    @Resource
    private I大气样品DAO i大气样品DAO;

    public void addRecord(大气样品 record) throws Exception {
        i大气样品DAO.insert(record);
    }

    public List<大气样品> queryRecordsByCond(Map<String, String> cond) throws Exception {
        大气样品Example example = new 大气样品Example() ;
        大气样品Example.Criteria c = example.or();

        if(StringUtils.isNotBlank(cond.get("项目编号"))) {
            String prjCode = cond.get("项目编号");
            c.and项目编号EqualTo(prjCode);
        }
        if(StringUtils.isNotBlank(cond.get("点位编号"))) {
            c.and点位编号EqualTo(cond.get("点位编号"));
        }
        if(StringUtils.isNotBlank(cond.get("样品编号"))) {
            c.and样品编号EqualTo(cond.get("样品编号"));
        }
        return i大气样品DAO.selectByExample(example);
    }

    public List<大气样品> queryNotUploadRecordsByCond(Map<String, String> cond) throws Exception {
        大气样品Example example = new 大气样品Example() ;
        大气样品Example.Criteria c = example.or();

        if(StringUtils.isNotBlank(cond.get("项目编号"))) {
            String prjCode = cond.get("项目编号");
            c.and项目编号EqualTo(prjCode);
        }
        if(StringUtils.isNotBlank(cond.get("点位编号"))) {
            c.and点位编号EqualTo(cond.get("点位编号"));
        }
        c.and勾选NotEqualTo("y");
        return i大气样品DAO.selectByExample(example);
    }

    public void modify(Map<String, String> cond, 大气样品 record) throws Exception {
        //项目编号、点位编号、样品编号三个值不能为空
        if(StringUtils.isBlank(cond.get("项目编号")) || StringUtils.isBlank(cond.get("点位编号")) || StringUtils.isBlank(cond.get("样品编号"))) {
            return;
        }
        大气样品Example example = new 大气样品Example() ;
        大气样品Example.Criteria c = example.or();
        c.and项目编号EqualTo(cond.get("项目编号"));
        c.and点位编号EqualTo(cond.get("点位编号"));
        c.and样品编号EqualTo(cond.get("样品编号"));

        i大气样品DAO.updateByExample(record,example);
    }
}

