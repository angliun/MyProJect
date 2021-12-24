package com.shop.erp.pojo;

import java.util.Date;

public class Recruit {
    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", personnel='" + personnel + '\'' +
                ", wages='" + wages + '\'' +
                ", requirement='" + requirement + '\'' +
                ", recruitment_object='" + recruitment_object + '\'' +
                ", release_date=" + release_date +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", red=" + red +
                '}';
    }

    private Integer id;

    private String company_name;

    private String personnel;

    private String wages;

    private String requirement;

    private String recruitment_object;

    private Date release_date;

    private String telephone;

    private String address;

    private Integer red;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name == null ? null : company_name.trim();
    }

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel == null ? null : personnel.trim();
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages == null ? null : wages.trim();
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public String getRecruitment_object() {
        return recruitment_object;
    }

    public void setRecruitment_object(String recruitment_object) {
        this.recruitment_object = recruitment_object == null ? null : recruitment_object.trim();
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }
}