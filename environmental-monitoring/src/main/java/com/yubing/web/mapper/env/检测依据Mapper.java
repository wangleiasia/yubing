package com.yubing.web.mapper.env;

import com.yubing.web.model.env.检测依据;
import com.yubing.web.model.env.检测依据Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface 检测依据Mapper {
    long countByExample(检测依据Example example);

    int deleteByExample(检测依据Example example);

    int insert(检测依据 record);

    int insertSelective(检测依据 record);

    List<检测依据> selectByExample(检测依据Example example);

    int updateByExampleSelective(@Param("record") 检测依据 record, @Param("example") 检测依据Example example);

    int updateByExample(@Param("record") 检测依据 record, @Param("example") 检测依据Example example);
}