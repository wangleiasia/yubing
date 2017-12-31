package com.yubing.web.mapper.env;

import com.yubing.web.model.env.锅炉模板;
import com.yubing.web.model.env.锅炉模板Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 锅炉模板Mapper {
    long countByExample(锅炉模板Example example);

    int deleteByExample(锅炉模板Example example);

    int insert(锅炉模板 record);

    int insertSelective(锅炉模板 record);

    List<锅炉模板> selectByExample(锅炉模板Example example);

    int updateByExampleSelective(@Param("record") 锅炉模板 record, @Param("example") 锅炉模板Example example);

    int updateByExample(@Param("record") 锅炉模板 record, @Param("example") 锅炉模板Example example);
}