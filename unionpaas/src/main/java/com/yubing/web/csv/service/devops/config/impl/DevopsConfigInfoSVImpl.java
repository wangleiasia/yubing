package com.yubing.web.csv.service.devops.config.impl;

import com.yubing.util.DateUtil;
import com.yubing.web.csv.dao.constraint.IKeyGeneratorDAO;
import com.yubing.web.csv.dao.devops.config.IDevopsConfigInfoDAO;
import com.yubing.web.csv.service.devops.config.interfaces.IDevopsConfigInfoSV;
import com.yubing.web.model.constraint.KeyGenerator;
import com.yubing.web.model.devops.config.DevopsConfigInfo;
import com.yubing.web.model.devops.config.DevopsConfigInfoExample;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/11/20.
 */
@Service(value="sDevopsConfigInfoSVImpl")
public class DevopsConfigInfoSVImpl implements IDevopsConfigInfoSV {

    @Resource
    private IDevopsConfigInfoDAO iDevopsConfigInfoDAO;
    @Resource
    private IKeyGeneratorDAO iKeyGeneratorDAO;

    public void saveDevopsConfigInfo(DevopsConfigInfo record) throws Exception {
        KeyGenerator keyGenerator = new KeyGenerator("DEVOPS_CONFIG_INFO_ID$SEQ.Nextval");
        long seqId = iKeyGeneratorDAO.getLongKeyId(keyGenerator);
        record.setConfigId(seqId);
        iDevopsConfigInfoDAO.insert(record);
    }

    public List<DevopsConfigInfo> queryRecordsByCond(Map<String, String> cond) throws Exception {
        DevopsConfigInfoExample example = new DevopsConfigInfoExample();
        DevopsConfigInfoExample.Criteria c = example.or();

        SimpleDateFormat format = new SimpleDateFormat(DateUtil.FORMAT_YYYYMMDD24HHMMSS);
        if(StringUtils.isNotBlank(cond.get("condBeginDate")) && StringUtils.isNotBlank(cond.get("condEndDate"))) {
            c.andCreateDateBetween(format.parse(cond.get("condBeginDate")),format.parse(cond.get("condEndDate")));
        }
        if(StringUtils.isNotBlank(cond.get("condDmpId"))) {
            c.andDmpIdEqualTo(cond.get("condDmpId"));
        }
        if(StringUtils.isNotBlank(cond.get("condModifyState"))) {
            short status = Short.valueOf(cond.get("condModifyState"));
            if(status > -1) {
                c.andConfigStatusEqualTo(status);
            }
        }

        return iDevopsConfigInfoDAO.selectByExample(example);
    }

    public void deleteRecordById(long id) throws Exception {
        iDevopsConfigInfoDAO.deleteByPrimaryKey(id);
    }

    public void modify(DevopsConfigInfo record) throws Exception {
        iDevopsConfigInfoDAO.updateByPrimaryKey(record);
    }
}
