package com.yubing.web.mapper.env;

import com.yubing.web.model.env.设备台账;
import com.yubing.web.model.env.设备台账Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 设备台账Mapper {
    long countByExample(设备台账Example example);

    int deleteByExample(设备台账Example example);

    int insert(设备台账 record);

    int insertSelective(设备台账 record);

    List<设备台账> selectByExample(设备台账Example example);

    int updateByExampleSelective(@Param("record") 设备台账 record, @Param("example") 设备台账Example example);

    int updateByExample(@Param("record") 设备台账 record, @Param("example") 设备台账Example example);
}