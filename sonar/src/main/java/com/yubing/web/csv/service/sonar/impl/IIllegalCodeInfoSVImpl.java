package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.sonar.IIllegalCodeInfoDAO;
import com.yubing.web.csv.service.sonar.interfaces.IIllegalCodeInfoSV;
import com.yubing.web.model.sonar.IllegalCodeInfo;
import com.yubing.web.model.sonar.IllegalCodeInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/1.
 */
@Service(value="sIIllegalCodeInfoSVImpl")
public class IIllegalCodeInfoSVImpl implements IIllegalCodeInfoSV {

    @Resource
    private IIllegalCodeInfoDAO iIllegalCodeInfoDAO;

    public void saveIllegalCodeInfo(IllegalCodeInfo record) throws Exception {
        iIllegalCodeInfoDAO.insert(record);
    }

    public void saveIllegalCodeInfos(List<IllegalCodeInfo> records) throws Exception {
        if(null == records || records.size() < 1) {
            return;
        }
        for(IllegalCodeInfo record : records) {
            saveIllegalCodeInfo(record);
        }
    }

    public List<IllegalCodeInfo> queryIllegalCodeInfos(Map<String, String> params) throws Exception {
        IllegalCodeInfoExample example = new IllegalCodeInfoExample();
        IllegalCodeInfoExample.Criteria c = example.or();
        if(params.containsKey("developer")) {
            c.andDeveloperEqualTo(params.get("developer"));
        }
        if(params.containsKey("batchNumber")) {
            c.andBatchNumberEqualTo(Integer.parseInt(params.get("batchNumber")));
        }
        c.andStateEqualTo((short)1);
        return iIllegalCodeInfoDAO.selectByExample(example);
    }

    public void modifyIllegalCodeInfo(int illegalId, String bugSerial) throws Exception {

        IllegalCodeInfo illegalCodeInfo = iIllegalCodeInfoDAO.selectByPrimaryKey(illegalId);

        IllegalCodeInfoExample example = new IllegalCodeInfoExample();
        IllegalCodeInfoExample.Criteria c = example.or();
        c.andIllegalIdEqualTo(illegalId);

        illegalCodeInfo.setBugSerial(bugSerial);
        iIllegalCodeInfoDAO.updateByPrimaryKey(illegalCodeInfo);
    }
}
