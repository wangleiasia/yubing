package com.yubing.web.csv.service.env.impl;

import com.yubing.web.csv.dao.env.I样品管理DAO;
import com.yubing.web.csv.service.env.interfaces.I样品管理SV;
import com.yubing.web.model.env.样品管理;
import com.yubing.web.model.env.样品管理Example;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/2/10.
 */
@Service(value="s样品管理SVImpl")
public class 样品管理SVImpl implements I样品管理SV {

    @Resource
    private I样品管理DAO i样品管理DAO;

    public void addRecord(样品管理 record) throws Exception {
        i样品管理DAO.insert(record);
    }

    public List<样品管理> queryRecordsByCond(Map<String, String> cond) throws Exception {
        样品管理Example example = new 样品管理Example() ;
        样品管理Example.Criteria c = example.or();

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
        return i样品管理DAO.selectByExample(example);
    }

    public List<样品管理> queryNotUploadRecordsByCond(Map<String, String> cond) throws Exception {
        样品管理Example example = new 样品管理Example() ;
        样品管理Example.Criteria c = example.or();

        if(StringUtils.isNotBlank(cond.get("项目编号"))) {
            String prjCode = cond.get("项目编号");
            c.and项目编号EqualTo(prjCode);
        }
        if(StringUtils.isNotBlank(cond.get("点位编号"))) {
            c.and点位编号EqualTo(cond.get("点位编号"));
        }
        if(StringUtils.isNotBlank(cond.get("勾选"))) {
            c.and勾选NotEqualTo(cond.get("勾选"));
        }
        if(StringUtils.isNotBlank(cond.get("样品类别"))) {
            c.and样品类别EqualTo(cond.get("样品类别"));
        }
        return i样品管理DAO.selectByExample(example);
    }

    public void modify(Map<String, String> cond, 样品管理 record) throws Exception {
        //项目编号、点位编号、样品编号三个值不能为空
        if(StringUtils.isBlank(cond.get("项目编号")) || StringUtils.isBlank(cond.get("点位编号")) || StringUtils.isBlank(cond.get("样品编号")) || StringUtils.isBlank(cond.get("时间段"))) {
            return;
        }
        样品管理Example example = new 样品管理Example() ;
        样品管理Example.Criteria c = example.or();
        c.and项目编号EqualTo(cond.get("项目编号"));
        c.and点位编号EqualTo(cond.get("点位编号"));
        c.and样品编号EqualTo(cond.get("样品编号"));
        c.and时间段EqualTo(cond.get("时间段"));

        i样品管理DAO.updateByExample(record,example);
    }
}
