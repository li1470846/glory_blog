package com.zking.ssm.model;

import java.util.Date;

public class Visitor {
    private Integer visitorId;

    private Long userId;

    private String visitorIp;

    private Date visitorDate;

    private Integer visitorCount;

    public Visitor(Integer visitorId, Long userId, String visitorIp, Date visitorDate, Integer visitorCount) {
        this.visitorId = visitorId;
        this.userId = userId;
        this.visitorIp = visitorIp;
        this.visitorDate = visitorDate;
        this.visitorCount = visitorCount;
    }

    public Visitor() {
        super();
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    public Date getVisitorDate() {
        return visitorDate;
    }

    public void setVisitorDate(Date visitorDate) {
        this.visitorDate = visitorDate;
    }

    public Integer getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(Integer visitorCount) {
        this.visitorCount = visitorCount;
    }
}