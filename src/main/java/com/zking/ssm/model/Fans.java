package com.zking.ssm.model;

public class Fans {
    private Integer fansId;

    private Long userId;

    private Long fansUserId;

    public Fans(Integer fansId, Long userId, Long fansUserId) {
        this.fansId = fansId;
        this.userId = userId;
        this.fansUserId = fansUserId;
    }

    public Fans() {
        super();
    }

    public Integer getFansId() {
        return fansId;
    }

    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFansUserId() {
        return fansUserId;
    }

    public void setFansUserId(Long fansUserId) {
        this.fansUserId = fansUserId;
    }
}