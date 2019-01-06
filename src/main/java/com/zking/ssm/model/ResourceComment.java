package com.zking.ssm.model;

import java.util.Date;

public class ResourceComment {
    private Integer resourceCommentId;

    private Long userId;

    private Integer resourceId;

    private String resourceCommentComment;

    private Date resourceCommentDate;

    private Integer resourceCommentScore;

    public ResourceComment(Integer resourceCommentId, Long userId, Integer resourceId, String resourceCommentComment, Date resourceCommentDate, Integer resourceCommentScore) {
        this.resourceCommentId = resourceCommentId;
        this.userId = userId;
        this.resourceId = resourceId;
        this.resourceCommentComment = resourceCommentComment;
        this.resourceCommentDate = resourceCommentDate;
        this.resourceCommentScore = resourceCommentScore;
    }

    public ResourceComment() {
        super();
    }

    public Integer getResourceCommentId() {
        return resourceCommentId;
    }

    public void setResourceCommentId(Integer resourceCommentId) {
        this.resourceCommentId = resourceCommentId;
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

    public String getResourceCommentComment() {
        return resourceCommentComment;
    }

    public void setResourceCommentComment(String resourceCommentComment) {
        this.resourceCommentComment = resourceCommentComment;
    }

    public Date getResourceCommentDate() {
        return resourceCommentDate;
    }

    public void setResourceCommentDate(Date resourceCommentDate) {
        this.resourceCommentDate = resourceCommentDate;
    }

    public Integer getResourceCommentScore() {
        return resourceCommentScore;
    }

    public void setResourceCommentScore(Integer resourceCommentScore) {
        this.resourceCommentScore = resourceCommentScore;
    }
}