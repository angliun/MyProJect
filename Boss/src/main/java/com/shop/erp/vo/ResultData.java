package com.shop.erp.vo;

import java.io.Serializable;

public class ResultData implements Serializable {
    private String code;
    private String message;

    //查询用
    private Object data="增删改用，不用带数据";
    //查询集合分页用，总行数
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ResultData() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}