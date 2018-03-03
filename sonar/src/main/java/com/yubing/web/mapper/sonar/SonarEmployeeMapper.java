package com.yubing.web.mapper.sonar;

import com.yubing.web.model.sonar.SonarEmployee;
import com.yubing.web.model.sonar.SonarEmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SonarEmployeeMapper {
    long countByExample(SonarEmployeeExample example);

    int deleteByExample(SonarEmployeeExample example);

    int insert(SonarEmployee record);

    int insertSelective(SonarEmployee record);

    List<SonarEmployee> selectByExample(SonarEmployeeExample example);

    int updateByExampleSelective(@Param("record") SonarEmployee record, @Param("example") SonarEmployeeExample example);

    int updateByExample(@Param("record") SonarEmployee record, @Param("example") SonarEmployeeExample example);
}