package com.yubing.web.mapper.env;

import com.yubing.web.model.env.shouquanbiao;
import com.yubing.web.model.env.shouquanbiaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface shouquanbiaoMapper {
    long countByExample(shouquanbiaoExample example);

    int deleteByExample(shouquanbiaoExample example);

    int insert(shouquanbiao record);

    int insertSelective(shouquanbiao record);

    List<shouquanbiao> selectByExample(shouquanbiaoExample example);

    int updateByExampleSelective(@Param("record") shouquanbiao record, @Param("example") shouquanbiaoExample example);

    int updateByExample(@Param("record") shouquanbiao record, @Param("example") shouquanbiaoExample example);
}