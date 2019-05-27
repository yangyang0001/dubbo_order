package com.inspur.dubbo.entity;

import java.io.Serializable;

/**
 * User: YANG
 * Date: 2019/5/26-22:45
 * Description: No Description
 */
public class OrderRequest implements Serializable{

    private static final long serialVersionUID = 8693938848605741242L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
