package com.yubing.web.controller.env;

import com.yubing.web.controller.ControllerUtil;
import com.yubing.web.csv.service.env.interfaces.I现场噪声监测记录SV;
import com.yubing.web.model.env.现场噪声监测记录;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by wanglei on 2017/12/16.
 */
@Controller
public class Controller现场噪声监测记录 {

    @Resource
    I现场噪声监测记录SV s现场噪声监测记录SVImpl;


    @ResponseBody
    @RequestMapping(value="/保存现场噪声监测记录",produces="text/json;charset=UTF-8")
    public String addNewRecord(现场噪声监测记录 record) throws Exception {
        s现场噪声监测记录SVImpl.add现场噪声监测记录(record);
        return ControllerUtil.result(true,"保存现场噪声监测记录成功");
    }

}
