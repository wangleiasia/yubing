package com.yubing.web.mapper.env;

import com.yubing.web.model.env.大气样品;
import com.yubing.web.model.env.大气样品Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 大气样品Mapper {
    long countByExample(大气样品Example example);

    int deleteByExample(大气样品Example example);

    int insert(大气样品 record);

    int insertSelective(大气样品 record);

    List<大气样品> selectByExample(大气样品Example example);

    int updateByExampleSelective(@Param("record") 大气样品 record, @Param("example") 大气样品Example example);

    int updateByExample(@Param("record") 大气样品 record, @Param("example") 大气样品Example example);
}