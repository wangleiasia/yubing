package com.yubing.web.mapper.sonar;

import com.yubing.web.model.sonar.IllegalCodeInfo;
import com.yubing.web.model.sonar.IllegalCodeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IllegalCodeInfoMapper {
    long countByExample(IllegalCodeInfoExample example);

    int deleteByExample(IllegalCodeInfoExample example);

    int deleteByPrimaryKey(Integer illegalId);

    int insert(IllegalCodeInfo record);

    int insertSelective(IllegalCodeInfo record);

    List<IllegalCodeInfo> selectByExample(IllegalCodeInfoExample example);

    IllegalCodeInfo selectByPrimaryKey(Integer illegalId);

    int updateByExampleSelective(@Param("record") IllegalCodeInfo record, @Param("example") IllegalCodeInfoExample example);

    int updateByExample(@Param("record") IllegalCodeInfo record, @Param("example") IllegalCodeInfoExample example);

    int updateByPrimaryKeySelective(IllegalCodeInfo record);

    int updateByPrimaryKey(IllegalCodeInfo record);
}