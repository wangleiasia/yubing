package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I锅炉数据DAO;
import com.yubing.web.csv.service.env.interfaces.I锅炉数据SV;
import com.yubing.web.model.env.锅炉数据;
import com.yubing.web.model.env.锅炉数据Example;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/20.
 */
@Service(value="s锅炉数据SVImpl")
public class 锅炉数据SVImpl implements I锅炉数据SV {

    @Resource
    I锅炉数据DAO i锅炉数据DAO;

    public void addRecord(锅炉数据 record) throws Exception {
        i锅炉数据DAO.insert(record);
    }

    public void addRecords(List<锅炉数据> records) throws Exception {
        if(null == records || records.size() < 1) {
            return;
        }
        for (锅炉数据 record : records) {
            addRecord(record);
        }
    }

    public List<锅炉数据> queryRecordsByCond(Map<String, String> cond) throws Exception {
        锅炉数据Example example = new 锅炉数据Example() ;
        锅炉数据Example.Criteria c = example.or();

        if(StringUtils.isNotBlank(cond.get("项目编号"))) {
            c.and项目编号EqualTo(cond.get("项目编号"));
        }
        if(StringUtils.isNotBlank(cond.get("点位编号"))) {
            c.and点位编号EqualTo(cond.get("点位编号"));
        }
        if(StringUtils.isNotBlank(cond.get("样品编号"))) {
            c.and样品编号EqualTo(cond.get("样品编号"));
        }

        return i锅炉数据DAO.selectByExample(example);
    }

    public void updateGlsj(锅炉数据 record) throws Exception {
        锅炉数据Example example = new 锅炉数据Example() ;
        锅炉数据Example.Criteria c = example.or();

        c.and项目编号EqualTo(record.get项目编号());
        c.and点位编号EqualTo(record.get点位编号());
        c.and样品编号EqualTo(record.get样品编号());
        c.and序号EqualTo(record.get序号());
        c.and项目名称EqualTo(record.get项目名称());
        c.and方法代码EqualTo(record.get方法代码());

        List<锅炉数据> infos = i锅炉数据DAO.selectByExample(example);
        if(null == infos || infos.size() != 1) {
            return;
        }

        锅炉数据 info = infos.get(0);
        info.set检测日期(record.get检测日期());
        info.set时间(record.get时间());
        info.set检测结果(record.get检测结果());
        info.set仪器编号(record.get仪器编号());

        i锅炉数据DAO.updateByExample(info,example);
    }
}
