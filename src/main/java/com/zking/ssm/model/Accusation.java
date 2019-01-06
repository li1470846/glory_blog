package com.zking.ssm.model;

import java.util.Date;

public class Accusation {
    private Integer accusationId;

    private Long userId;

    private Integer resourceId;

    private String accusationReson;

    private String accusationDetail;

    private Date accusationDate;

    private Integer accusationState;

    public Accusation(Integer accusationId, Long userId, Integer resourceId, String accusationReson, String accusationDetail, Date accusationDate, Integer accusationState) {
        this.accusationId = accusationId;
        this.userId = userId;
        this.resourceId = resourceId;
        this.accusationReson = accusationReson;
        this.accusationDetail = accusationDetail;
        this.accusationDate = accusationDate;
        this.accusationState = accusationState;
    }

    public Accusation() {
        super();
    }

    public Integer getAccusationId() {
        return accusationId;
    }

    public void setAccusationId(Integer accusationId) {
        this.accusationId = accusationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getAccusationReson() {
        return accusationReson;
    }

    public void setAccusationReson(String accusationReson) {
        this.accusationReson = accusationReson;
    }

    public String getAccusationDetail() {
        return accusationDetail;
    }

    public void setAccusationDetail(String accusationDetail) {
        this.accusationDetail = accusationDetail;
    }

    public Date getAccusationDate() {
        return accusationDate;
    }

    public void setAccusationDate(Date accusationDate) {
        this.accusationDate = accusationDate;
    }

    public Integer getAccusationState() {
        return accusationState;
    }

    public void setAccusationState(Integer accusationState) {
        this.accusationState = accusationState;
    }
}