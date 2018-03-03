package com.yubing.web.model.constraint;

public class KeyGenerator {

    private String sequenceName;

    public KeyGenerator(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }
}