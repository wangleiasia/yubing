package com.yubing.web.mapper.env;

import com.yubing.web.model.env.锅炉数据;
import com.yubing.web.model.env.锅炉数据Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 锅炉数据Mapper {
    long countByExample(锅炉数据Example example);

    int deleteByExample(锅炉数据Example example);

    int insert(锅炉数据 record);

    int insertSelective(锅炉数据 record);

    List<锅炉数据> selectByExample(锅炉数据Example example);

    int updateByExampleSelective(@Param("record") 锅炉数据 record, @Param("example") 锅炉数据Example example);

    int updateByExample(@Param("record") 锅炉数据 record, @Param("example") 锅炉数据Example example);
}