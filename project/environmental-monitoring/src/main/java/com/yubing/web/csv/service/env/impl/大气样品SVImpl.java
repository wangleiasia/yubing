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
        return i大气样品DAO.selectByExample(example);
    }
}
