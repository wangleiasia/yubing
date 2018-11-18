package com.yubing.web.csv.service.sonar.interfaces;

import com.yubing.web.model.sonar.SonarEmployee;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/3.
 */
public interface ISonarEmployeeSV {

    List<SonarEmployee> querySonarEmployees(Map<String,String> params) throws Exception;

}
