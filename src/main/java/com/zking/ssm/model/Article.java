package com.zking.ssm.model;

import java.util.Date;

public class Article {
    private Long articleId;

    private Long userId;

    private String articleTitle;

    private Integer articleTypeId;

    private Integer articleClassfyId;

    private Integer articlePublic;

    private Integer articleState;

    private Date articleDate;

    private Date lastUpdateDate;

    private Integer articleIndex;

    private Integer articleCommentFlag;

    private String articleContent;

    public Article(Long articleId, Long userId, String articleTitle, Integer articleTypeId, Integer articleClassfyId, Integer articlePublic, Integer articleState, Date articleDate, Date lastUpdateDate, Integer articleIndex, Integer articleCommentFlag, String articleContent) {
        this.articleId = articleId;
        this.userId = userId;
        this.articleTitle = articleTitle;
        this.articleTypeId = articleTypeId;
        this.articleClassfyId = articleClassfyId;
        this.articlePublic = articlePublic;
        this.articleState = articleState;
        this.articleDate = articleDate;
        this.lastUpdateDate = lastUpdateDate;
        this.articleIndex = articleIndex;
        this.articleCommentFlag = articleCommentFlag;
        this.articleContent = articleContent;
    }

    public Article() {
        super();
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public Integer getArticleClassfyId() {
        return articleClassfyId;
    }

    public void setArticleClassfyId(Integer articleClassfyId) {
        this.articleClassfyId = articleClassfyId;
    }

    public Integer getArticlePublic() {
        return articlePublic;
    }

    public void setArticlePublic(Integer articlePublic) {
        this.articlePublic = articlePublic;
    }

    public Integer getArticleState() {
        return articleState;
    }

    public void setArticleState(Integer articleState) {
        this.articleState = articleState;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getArticleIndex() {
        return articleIndex;
    }

    public void setArticleIndex(Integer articleIndex) {
        this.articleIndex = articleIndex;
    }

    public Integer getArticleCommentFlag() {
        return articleCommentFlag;
    }

    public void setArticleCommentFlag(Integer articleCommentFlag) {
        this.articleCommentFlag = articleCommentFlag;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}