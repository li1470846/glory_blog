package com.zking.ssm.model;

public class UserClassfy {
    private Integer userClassfyId;

    private Long userId;

    private String userClassfyName;

    private Integer userClassfyShow;

    private Integer userClassfyIndex;

    public UserClassfy(Integer userClassfyId, Long userId, String userClassfyName, Integer userClassfyShow, Integer userClassfyIndex) {
        this.userClassfyId = userClassfyId;
        this.userId = userId;
        this.userClassfyName = userClassfyName;
        this.userClassfyShow = userClassfyShow;
        this.userClassfyIndex = userClassfyIndex;
    }

    public UserClassfy() {
        super();
    }

    public Integer getUserClassfyId() {
        return userClassfyId;
    }

    public void setUserClassfyId(Integer userClassfyId) {
        this.userClassfyId = userClassfyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserClassfyName() {
        return userClassfyName;
    }

    public void setUserClassfyName(String userClassfyName) {
        this.userClassfyName = userClassfyName;
    }

    public Integer getUserClassfyShow() {
        return userClassfyShow;
    }

    public void setUserClassfyShow(Integer userClassfyShow) {
        this.userClassfyShow = userClassfyShow;
    }

    public Integer getUserClassfyIndex() {
        return userClassfyIndex;
    }

    public void setUserClassfyIndex(Integer userClassfyIndex) {
        this.userClassfyIndex = userClassfyIndex;
    }
}