package com.yubing.web.mapper.sonar;

import com.yubing.web.model.sonar.IllegalBatchInfo;
import com.yubing.web.model.sonar.IllegalBatchInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IllegalBatchInfoMapper {
    long countByExample(IllegalBatchInfoExample example);

    int deleteByExample(IllegalBatchInfoExample example);

    int deleteByPrimaryKey(Integer batchNumber);

    int insert(IllegalBatchInfo record);

    int insertSelective(IllegalBatchInfo record);

    List<IllegalBatchInfo> selectByExample(IllegalBatchInfoExample example);

    IllegalBatchInfo selectByPrimaryKey(Integer batchNumber);

    int updateByExampleSelective(@Param("record") IllegalBatchInfo record, @Param("example") IllegalBatchInfoExample example);

    int updateByExample(@Param("record") IllegalBatchInfo record, @Param("example") IllegalBatchInfoExample example);

    int updateByPrimaryKeySelective(IllegalBatchInfo record);

    int updateByPrimaryKey(IllegalBatchInfo record);
}