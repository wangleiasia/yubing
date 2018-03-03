package com.yubing.web.csv.service.sonar.interfaces;

import com.yubing.web.model.sonar.IllegalBatchInfo;

import java.util.List;

/**
 * Created by wanglei on 2018/3/1.
 */
public interface IIllegalBatchInfoSV {

    void saveIllegalBatchInfo(IllegalBatchInfo record) throws Exception;

    void saveIllegalBatchInfos(List<IllegalBatchInfo> records) throws Exception;

    List<IllegalBatchInfo> queryIllegalBatchInfosByBatchNumber() throws Exception;

}
