package com.zking.ssm.model;

import java.util.Date;

public class ArticleVisit {
    private Integer articleVisitId;

    private Long articleId;

    private String visitIp;

    private Date articleVisitDate;

    private Integer articleVisitCount;

    public ArticleVisit(Integer articleVisitId, Long articleId, String visitIp, Date articleVisitDate, Integer articleVisitCount) {
        this.articleVisitId = articleVisitId;
        this.articleId = articleId;
        this.visitIp = visitIp;
        this.articleVisitDate = articleVisitDate;
        this.articleVisitCount = articleVisitCount;
    }

    public ArticleVisit() {
        super();
    }

    public Integer getArticleVisitId() {
        return articleVisitId;
    }

    public void setArticleVisitId(Integer articleVisitId) {
        this.articleVisitId = articleVisitId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }

    public Date getArticleVisitDate() {
        return articleVisitDate;
    }

    public void setArticleVisitDate(Date articleVisitDate) {
        this.articleVisitDate = articleVisitDate;
    }

    public Integer getArticleVisitCount() {
        return articleVisitCount;
    }

    public void setArticleVisitCount(Integer articleVisitCount) {
        this.articleVisitCount = articleVisitCount;
    }
}