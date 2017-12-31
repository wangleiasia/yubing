package com.yubing.web.csv.service.env.impl;

import com.yubing.util.cache.BoilerTemplateCache;
import com.yubing.web.csv.dao.env.I锅炉模板DAO;
import com.yubing.web.csv.service.env.interfaces.I锅炉模板SV;
import com.yubing.web.model.env.锅炉模板;
import com.yubing.web.model.env.锅炉模板Example;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/20.
 */
@Service(value="s锅炉模板SVImpl")
public class 锅炉模板SVImpl implements I锅炉模板SV {

    @Resource
    I锅炉模板DAO i锅炉模板DAO;

    public void addRecord(锅炉模板 record) throws Exception {
        i锅炉模板DAO.insert(record);
    }

    public List<锅炉模板> queryRecordsByCond(Map<String, String> cond) throws Exception {
        锅炉模板Example example = new 锅炉模板Example() ;
        锅炉模板Example.Criteria c = example.or();

        if(StringUtils.isNotBlank(cond.get("对应项目"))) {
            c.and对应项目EqualTo(cond.get("对应项目"));
        }
        if(StringUtils.isNotBlank(cond.get("项目名称"))) {
            c.and项目名称EqualTo(cond.get("项目名称"));
        }

        return i锅炉模板DAO.selectByExample(example);
    }

    public 锅炉模板 queryRecordsFromCache(String toPrj) throws Exception {
        Object obj = BoilerTemplateCache.getValueByKey(toPrj,i锅炉模板DAO);
        if(null == obj) {
            return null;
        }else{
            return (锅炉模板)obj;
        }
    }
}
