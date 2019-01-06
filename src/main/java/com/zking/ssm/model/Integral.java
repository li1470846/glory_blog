package com.zking.ssm.model;

import java.util.Date;

public class Integral {
    private Integer integralId;

    private Long userId;

    private Integer integralCount;

    private Date integralDate;

    private String integralSource;

    public Integral(Integer integralId, Long userId, Integer integralCount, Date integralDate, String integralSource) {
        this.integralId = integralId;
        this.userId = userId;
        this.integralCount = integralCount;
        this.integralDate = integralDate;
        this.integralSource = integralSource;
    }

    public Integral() {
        super();
    }

    public Integer getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Integer integralId) {
        this.integralId = integralId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIntegralCount() {
        return integralCount;
    }

    public void setIntegralCount(Integer integralCount) {
        this.integralCount = integralCount;
    }

    public Date getIntegralDate() {
        return integralDate;
    }

    public void setIntegralDate(Date integralDate) {
        this.integralDate = integralDate;
    }

    public String getIntegralSource() {
        return integralSource;
    }

    public void setIntegralSource(String integralSource) {
        this.integralSource = integralSource;
    }
}