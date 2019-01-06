package com.zking.ssm.model;

public class ArticleClassfy {
    private Integer articleClassfyId;

    private String articleClassfyName;

    public ArticleClassfy(Integer articleClassfyId, String articleClassfyName) {
        this.articleClassfyId = articleClassfyId;
        this.articleClassfyName = articleClassfyName;
    }

    public ArticleClassfy() {
        super();
    }

    public Integer getArticleClassfyId() {
        return articleClassfyId;
    }

    public void setArticleClassfyId(Integer articleClassfyId) {
        this.articleClassfyId = articleClassfyId;
    }

    public String getArticleClassfyName() {
        return articleClassfyName;
    }

    public void setArticleClassfyName(String articleClassfyName) {
        this.articleClassfyName = articleClassfyName;
    }
}