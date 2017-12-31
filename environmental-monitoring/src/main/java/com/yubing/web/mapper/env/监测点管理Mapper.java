package com.yubing.web.mapper.env;

import com.yubing.web.model.env.监测点管理;
import com.yubing.web.model.env.监测点管理Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 监测点管理Mapper {
    long countByExample(监测点管理Example example);

    int deleteByExample(监测点管理Example example);

    int insert(监测点管理 record);

    int insertSelective(监测点管理 record);

    List<监测点管理> selectByExample(监测点管理Example example);

    int updateByExampleSelective(@Param("record") 监测点管理 record, @Param("example") 监测点管理Example example);

    int updateByExample(@Param("record") 监测点管理 record, @Param("example") 监测点管理Example example);
}