package com.yubing.web.mapper.env;

import com.yubing.web.model.env.工况表;
import com.yubing.web.model.env.工况表Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 工况表Mapper {
    long countByExample(工况表Example example);

    int deleteByExample(工况表Example example);

    int insert(工况表 record);

    int insertSelective(工况表 record);

    List<工况表> selectByExample(工况表Example example);

    int updateByExampleSelective(@Param("record") 工况表 record, @Param("example") 工况表Example example);

    int updateByExample(@Param("record") 工况表 record, @Param("example") 工况表Example example);
}