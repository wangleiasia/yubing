package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.sonar.IDeveloperIllegalInfoDAO;
import com.yubing.web.csv.service.sonar.interfaces.IDeveloperIllegalInfoSV;
import com.yubing.web.model.sonar.DeveloperIllegalInfo;
import com.yubing.web.model.sonar.DeveloperIllegalInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/1.
 */
@Service(value="sDeveloperIllegalInfoSVImpl")
public class DeveloperIllegalInfoSVImpl implements IDeveloperIllegalInfoSV {

    @Resource
    private IDeveloperIllegalInfoDAO iDeveloperIllegalInfoDAO;

    public void saveDeveloperIllegalInfo(DeveloperIllegalInfo record) throws Exception {
        iDeveloperIllegalInfoDAO.insert(record);
    }

    public void saveDeveloperIllegalInfos(List<DeveloperIllegalInfo> records) throws Exception {
        if(null == records || records.size() < 1) {
            return;
        }
        for (DeveloperIllegalInfo record : records) {
            saveDeveloperIllegalInfo(record);
        }
    }

    public List<DeveloperIllegalInfo> queryDeveloperIllegalInfos(Map<String, String> params) throws Exception {
        DeveloperIllegalInfoExample example = new DeveloperIllegalInfoExample();
        DeveloperIllegalInfoExample.Criteria c = example.or();
        if(params.containsKey("batchNumber")) {
            c.andBatchNumberEqualTo(Integer.parseInt((String)params.get("batchNumber")));
        }
        if(params.containsKey("developer")) {
            c.andDeveloperEqualTo((String)params.get("developer"));
        }
        c.andStateEqualTo((short)1);
        return iDeveloperIllegalInfoDAO.selectByExample(example);
    }
}
