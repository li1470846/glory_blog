package com.zking.ssm.model;

public class ArticlePraisePoints {
    private Long appId;

    private Integer articleCommentId;

    private Long userId;

    public ArticlePraisePoints(Long appId, Integer articleCommentId, Long userId) {
        this.appId = appId;
        this.articleCommentId = articleCommentId;
        this.userId = userId;
    }

    public ArticlePraisePoints() {
        super();
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Integer getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(Integer articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}