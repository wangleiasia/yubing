package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.constraint.IKeyGeneratorDAO;
import com.yubing.web.csv.service.sonar.interfaces.IKeyGeneratorSV;
import com.yubing.web.model.constraint.KeyGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wanglei on 2018/3/1.
 */
@Service(value="sKeyGeneratorSVImpl")
public class KeyGeneratorSVImpl implements IKeyGeneratorSV {

    @Resource
    private IKeyGeneratorDAO iKeyGeneratorDAO;

    public int getIllegalCodeInfoId() throws Exception {
        KeyGenerator keyGenerator = new KeyGenerator("ILLEGAL_CODE_INFO$SEQ.Nextval");
        return iKeyGeneratorDAO.getKeyId(keyGenerator);
    }

    public int getIllegalBatchInfoId() throws Exception {
        KeyGenerator keyGenerator = new KeyGenerator("ILLEGAL_BATCH_INFO$SEQ.Nextval");
        return iKeyGeneratorDAO.getKeyId(keyGenerator);
    }
}
