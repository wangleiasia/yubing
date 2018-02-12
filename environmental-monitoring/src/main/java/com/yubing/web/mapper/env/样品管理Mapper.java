package com.yubing.web.mapper.env;

import java.util.List;
import com.yubing.web.model.env.样品管理;
import com.yubing.web.model.env.样品管理Example;
import org.apache.ibatis.annotations.Param;

public interface 样品管理Mapper {
    long countByExample(样品管理Example example);

    int deleteByExample(样品管理Example example);

    int insert(样品管理 record);

    int insertSelective(样品管理 record);

    List<样品管理> selectByExample(样品管理Example example);

    int updateByExampleSelective(@Param("record") 样品管理 record, @Param("example") 样品管理Example example);

    int updateByExample(@Param("record") 样品管理 record, @Param("example") 样品管理Example example);
}