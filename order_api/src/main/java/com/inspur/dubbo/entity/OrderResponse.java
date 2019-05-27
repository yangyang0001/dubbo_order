package com.inspur.dubbo.entity;

import java.io.Serializable;

/**
 * User: YANG
 * Date: 2019/5/26-22:47
 * Description: No Description
 */
public class OrderResponse implements Serializable{

    private static final long serialVersionUID = 5625298794713787060L;
    private Object data;
    private String code;
    private String memo;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
