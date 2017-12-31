package com.yubing.web.mapper.env;

import com.yubing.web.model.env.现场噪声监测记录;
import com.yubing.web.model.env.现场噪声监测记录Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 现场噪声监测记录Mapper {
    long countByExample(现场噪声监测记录Example example);

    int deleteByExample(现场噪声监测记录Example example);

    int insert(现场噪声监测记录 record);

    int insertSelective(现场噪声监测记录 record);

    List<现场噪声监测记录> selectByExample(现场噪声监测记录Example example);

    int updateByExampleSelective(@Param("record") 现场噪声监测记录 record, @Param("example") 现场噪声监测记录Example example);

    int updateByExample(@Param("record") 现场噪声监测记录 record, @Param("example") 现场噪声监测记录Example example);
}