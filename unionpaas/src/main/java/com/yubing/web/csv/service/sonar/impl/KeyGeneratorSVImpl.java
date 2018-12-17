package com.yubing.web.csv.service.sonar.impl;

import com.yubing.web.csv.dao.constraint.IKeyGeneratorDAO;
import com.yubing.web.csv.service.sonar.interfaces.IKeyGeneratorSV;
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
        /*KeyGenerator keyGenerator = new KeyGenerator("ILLEGAL_CODE_INFO$SEQ.Nextval");
        return iKeyGeneratorDAO.getKeyId(keyGenerator);*/
        return getKey();
    }

    public int getIllegalBatchInfoId() throws Exception {
        /*KeyGenerator keyGenerator = new KeyGenerator("ILLEGAL_BATCH_INFO$SEQ.Nextval");
        return iKeyGeneratorDAO.getKeyId(keyGenerator);*/
        return getKey();
    }

    private int getKey() {
        String millis =  System.currentTimeMillis()%10000+"";
        int rand = (int)(Math.random()*10000);
        return Integer.valueOf(millis+rand);
    }
}
