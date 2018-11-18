package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.sonar.IDeveloperIllegalInfoDAO;
import com.yubing.web.csv.dao.sonar.IIllegalCodeInfoDAO;
import com.yubing.web.csv.service.sonar.interfaces.IIllegalCodeInfoSV;
import com.yubing.web.model.sonar.DeveloperIllegalInfo;
import com.yubing.web.model.sonar.DeveloperIllegalInfoExample;
import com.yubing.web.model.sonar.IllegalCodeInfo;
import com.yubing.web.model.sonar.IllegalCodeInfoExample;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/1.
 */
@Service(value="sIIllegalCodeInfoSVImpl")
public class IIllegalCodeInfoSVImpl implements IIllegalCodeInfoSV {

    @Resource
    private IIllegalCodeInfoDAO iIllegalCodeInfoDAO;
    @Resource
    private IDeveloperIllegalInfoDAO iDeveloperIllegalInfoDAO;

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

    public Map<String,Object> modifyIllegalCodeInfo(int illegalId, Map<String, String> params) throws Exception {
        Map<String,Object> result = new HashedMap();

        IllegalCodeInfo illegalCodeInfo = iIllegalCodeInfoDAO.selectByPrimaryKey(illegalId);
        result.put("IllegalCodeInfo",illegalCodeInfo);

        String srcModifyState = illegalCodeInfo.getModifyState();
        String currentModifyState = "";
        int batchNumber = illegalCodeInfo.getBatchNumber();
        String developer = illegalCodeInfo.getDeveloper();

        IllegalCodeInfoExample example = new IllegalCodeInfoExample();
        IllegalCodeInfoExample.Criteria c = example.or();
        c.andIllegalIdEqualTo(illegalId);

        illegalCodeInfo.setModifyTime(new Date());
        if(params.containsKey("remark")) {
            illegalCodeInfo.setRemark(params.get("remark"));
        }
        if(params.containsKey("modifyDeveloper")) {
            illegalCodeInfo.setModifyDeveloper(params.get("modifyDeveloper"));
        }
        if(params.containsKey("bugSerial")) {
            illegalCodeInfo.setBugSerial(params.get("bugSerial"));
        }
        if(params.containsKey("modifyState")) {
            illegalCodeInfo.setModifyState(params.get("modifyState"));
            currentModifyState = params.get("modifyState");
        }

        iIllegalCodeInfoDAO.updateByPrimaryKey(illegalCodeInfo);

        DeveloperIllegalInfo developerIllegalInfo = queryDeveloperIllegalInfo(developer,batchNumber);
        if(null == developerIllegalInfo) {
            return result;
        }
        result.put("DeveloperIllegalInfo",developerIllegalInfo);

        if("Y".equals(currentModifyState) && (StringUtils.isBlank(srcModifyState) || "N".equals(srcModifyState))) {
            if(developerIllegalInfo.getHasModify() == null) {
                developerIllegalInfo.setHasModify(1);
            }else{
                developerIllegalInfo.setHasModify(developerIllegalInfo.getHasModify()+1);
            }
            developerIllegalInfo.setSurplus(developerIllegalInfo.getSurplus()-1);
        }else if("N".equals(currentModifyState) && StringUtils.isNotBlank(srcModifyState) && "Y".equals(srcModifyState)){
            //将已修改改为未修改
            developerIllegalInfo.setHasModify(developerIllegalInfo.getHasModify()-1);
            developerIllegalInfo.setSurplus(developerIllegalInfo.getSurplus()+1);
        }
        DeveloperIllegalInfoExample developerIllegalInfoExample = new DeveloperIllegalInfoExample();
        DeveloperIllegalInfoExample.Criteria dCriteria = developerIllegalInfoExample.or();
        dCriteria.andDeveloperEqualTo(developer);
        dCriteria.andBatchNumberEqualTo(batchNumber);
        iDeveloperIllegalInfoDAO.updateByExample(developerIllegalInfo,developerIllegalInfoExample);

        return result;
    }

    private DeveloperIllegalInfo queryDeveloperIllegalInfo(String developer,int batchNumber) throws Exception {
        DeveloperIllegalInfoExample example = new DeveloperIllegalInfoExample();
        DeveloperIllegalInfoExample.Criteria c = example.or();
        c.andDeveloperEqualTo(developer);
        c.andBatchNumberEqualTo(batchNumber);
        List<DeveloperIllegalInfo> developerIllegalInfos = iDeveloperIllegalInfoDAO.selectByExample(example);
        if(null == developerIllegalInfos || developerIllegalInfos.size() < 1) {
            return null;
        }else{
            return developerIllegalInfos.get(0);
        }
    }
}
