package com.zking.ssm.model;

public class UserClassfyArticle {
    private Integer userClassfyArticleId;

    private Integer userClassfyId;

    private Long articleId;

    public UserClassfyArticle(Integer userClassfyArticleId, Integer userClassfyId, Long articleId) {
        this.userClassfyArticleId = userClassfyArticleId;
        this.userClassfyId = userClassfyId;
        this.articleId = articleId;
    }

    public UserClassfyArticle() {
        super();
    }

    public Integer getUserClassfyArticleId() {
        return userClassfyArticleId;
    }

    public void setUserClassfyArticleId(Integer userClassfyArticleId) {
        this.userClassfyArticleId = userClassfyArticleId;
    }

    public Integer getUserClassfyId() {
        return userClassfyId;
    }

    public void setUserClassfyId(Integer userClassfyId) {
        this.userClassfyId = userClassfyId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}