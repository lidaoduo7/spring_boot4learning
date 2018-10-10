package com.seven.bean;

public class CommunityService {
    private Integer serviceid;

    private String serviceitem;

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServiceitem() {
        return serviceitem;
    }

    public void setServiceitem(String serviceitem) {
        this.serviceitem = serviceitem == null ? null : serviceitem.trim();
    }
}