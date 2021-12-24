package com.shop.erp.pojo;

import java.util.Date;

public class Role_table {
    @Override
    public String toString() {
        return "Role_table{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", creation_time=" + creation_time +
                '}';
    }

    private Integer id;

    private String role_name;

    private Date creation_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }
}