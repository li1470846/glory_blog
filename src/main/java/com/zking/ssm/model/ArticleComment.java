package com.zking.ssm.model;

import java.util.Date;

public class ArticleComment {
    private Integer articleCommentId;

    private Long userId;

    private Long articleId;

    private String articleCommentContent;

    private Date articleCommentDate;

    public ArticleComment(Integer articleCommentId, Long userId, Long articleId, String articleCommentContent, Date articleCommentDate) {
        this.articleCommentId = articleCommentId;
        this.userId = userId;
        this.articleId = articleId;
        this.articleCommentContent = articleCommentContent;
        this.articleCommentDate = articleCommentDate;
    }

    public ArticleComment() {
        super();
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

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getArticleCommentContent() {
        return articleCommentContent;
    }

    public void setArticleCommentContent(String articleCommentContent) {
        this.articleCommentContent = articleCommentContent;
    }

    public Date getArticleCommentDate() {
        return articleCommentDate;
    }

    public void setArticleCommentDate(Date articleCommentDate) {
        this.articleCommentDate = articleCommentDate;
    }
}