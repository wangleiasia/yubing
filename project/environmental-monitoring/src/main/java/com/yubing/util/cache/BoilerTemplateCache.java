package com.yubing.util.cache;

import com.yubing.web.csv.dao.env.I锅炉模板DAO;
import com.yubing.web.model.env.锅炉模板;
import com.yubing.web.model.env.锅炉模板Example;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wanglei on 2017/12/23.
 */
public class BoilerTemplateCache {

    private static ConcurrentHashMap<String,锅炉模板> cacheMap = new ConcurrentHashMap<String, 锅炉模板>();


    /**
     *
     * @param toPrj 对应项目
     * @param i锅炉模板DAO
     * @return
     * @throws Exception
     */
    public static Object getValueByKey(String toPrj,I锅炉模板DAO i锅炉模板DAO) throws Exception {
        if(StringUtils.isBlank(toPrj)) {
            return null;
        }
        String key = toPrj;
        if(cacheMap.containsKey(key)) {
            return cacheMap.get(key);
        }
        //如果不存在数据记录，则去数据表中查询
        锅炉模板Example example = new 锅炉模板Example() ;
        锅炉模板Example.Criteria c = example.or();
        c.and对应项目EqualTo(toPrj);

        List<锅炉模板> records = i锅炉模板DAO.selectByExample(example);
        if(null == records || records.size() < 1) {
            return null;
        }
        cacheMap.put(key,records.get(0));
        return records.get(0);
    }
}
