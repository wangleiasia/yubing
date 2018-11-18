package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.sonar.IIllegalBatchInfoDAO;
import com.yubing.web.csv.service.sonar.interfaces.IIllegalBatchInfoSV;
import com.yubing.web.model.sonar.IllegalBatchInfo;
import com.yubing.web.model.sonar.IllegalBatchInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wanglei on 2018/3/1.
 */
@Service(value="sIllegalBatchInfoSVImpl")
public class IllegalBatchInfoSVImpl implements IIllegalBatchInfoSV {

    @Resource
    private IIllegalBatchInfoDAO iIllegalBatchInfoDAO;

    public void saveIllegalBatchInfo(IllegalBatchInfo record) throws Exception {
        iIllegalBatchInfoDAO.insert(record);
    }

    public void saveIllegalBatchInfos(List<IllegalBatchInfo> records) throws Exception {
        if(null == records || records.size() < 1) {
            return;
        }
        for (IllegalBatchInfo record : records) {
            saveIllegalBatchInfo(record);
        }
    }

    public List<IllegalBatchInfo> queryIllegalBatchInfosByBatchNumber() throws Exception {
        IllegalBatchInfoExample example = new IllegalBatchInfoExample();
        IllegalBatchInfoExample.Criteria c = example.or();
        c.andStateEqualTo((short)1);
        return iIllegalBatchInfoDAO.selectByExample(example);
    }
}
