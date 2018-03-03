package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.sonar.ISonarEmployeeDAO;
import com.yubing.web.csv.service.sonar.interfaces.ISonarEmployeeSV;
import com.yubing.web.model.sonar.SonarEmployee;
import com.yubing.web.model.sonar.SonarEmployeeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/3.
 */
@Service(value="sSonarEmployeeSVImpl")
public class SonarEmployeeSVImpl implements ISonarEmployeeSV {

    @Resource
    private ISonarEmployeeDAO iSonarEmployeeDAO;

    public List<SonarEmployee> querySonarEmployees(Map<String, String> params) throws Exception {
        SonarEmployeeExample example = new SonarEmployeeExample();
        SonarEmployeeExample.Criteria c = example.or();

        if(params.containsKey("developer")) {
            c.andDeveloperEqualTo(params.get("developer"));
        }
        if(params.containsKey("password")) {
            c.andPasswordEqualTo(params.get("password"));
        }
        if(params.containsKey("superiorLeadership")) {
            c.andSuperiorLeadershipEqualTo(params.get("superiorLeadership"));
        }

        c.andStateEqualTo((short)1);
        return iSonarEmployeeDAO.selectByExample(example);
    }
}
