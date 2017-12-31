package com.yubing.web.mapper.constraint;

import com.yubing.web.model.constraint.KeyGenerator;

public interface KeyGeneratorMapper {

    int getKeyId(KeyGenerator keyGenerator) ;

    long getLongKeyId(KeyGenerator keyGenerator);

}