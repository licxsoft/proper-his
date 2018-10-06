package com.proper.his.security.demo.entity;

import com.proper.his.core.database.base.BaseEntity;

import java.io.Serializable;

public class DemoEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1L;

    private String name;

    private String password;

    private String testType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
