package com.yubing.web.mapper.sonar;

import com.yubing.web.model.sonar.DeveloperIllegalInfo;
import com.yubing.web.model.sonar.DeveloperIllegalInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeveloperIllegalInfoMapper {
    long countByExample(DeveloperIllegalInfoExample example);

    int deleteByExample(DeveloperIllegalInfoExample example);

    int insert(DeveloperIllegalInfo record);

    int insertSelective(DeveloperIllegalInfo record);

    List<DeveloperIllegalInfo> selectByExample(DeveloperIllegalInfoExample example);

    int updateByExampleSelective(@Param("record") DeveloperIllegalInfo record, @Param("example") DeveloperIllegalInfoExample example);

    int updateByExample(@Param("record") DeveloperIllegalInfo record, @Param("example") DeveloperIllegalInfoExample example);
}