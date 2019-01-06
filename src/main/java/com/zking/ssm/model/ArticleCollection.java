package com.zking.ssm.model;

public class ArticleCollection {
    private Integer articleCollectionId;

    private Long userId;

    private Long articleId;

    public ArticleCollection(Integer articleCollectionId, Long userId, Long articleId) {
        this.articleCollectionId = articleCollectionId;
        this.userId = userId;
        this.articleId = articleId;
    }

    public ArticleCollection() {
        super();
    }

    public Integer getArticleCollectionId() {
        return articleCollectionId;
    }

    public void setArticleCollectionId(Integer articleCollectionId) {
        this.articleCollectionId = articleCollectionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}