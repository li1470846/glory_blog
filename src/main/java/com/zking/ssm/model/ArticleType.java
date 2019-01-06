package com.zking.ssm.model;

public class ArticleType {
    private Integer articleTypeId;

    private String articleTypeName;

    public ArticleType(Integer articleTypeId, String articleTypeName) {
        this.articleTypeId = articleTypeId;
        this.articleTypeName = articleTypeName;
    }

    public ArticleType() {
        super();
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }
}