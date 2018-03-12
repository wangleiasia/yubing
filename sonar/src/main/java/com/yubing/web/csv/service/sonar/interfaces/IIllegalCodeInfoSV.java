package com.yubing.web.csv.service.sonar.interfaces;

import com.yubing.web.model.sonar.IllegalCodeInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by wanglei on 2018/3/1.
 */
public interface IIllegalCodeInfoSV {

    void saveIllegalCodeInfo(IllegalCodeInfo record) throws Exception;

    void saveIllegalCodeInfos(List<IllegalCodeInfo> records) throws Exception;

    List<IllegalCodeInfo> queryIllegalCodeInfos(Map<String,String> params) throws Exception;

    void modifyIllegalCodeInfo(int illegalId,String bugSerial) throws Exception;

    Map<String,Object> modifyIllegalCodeInfo(int illegalId,Map<String,String> params) throws Exception;

}
