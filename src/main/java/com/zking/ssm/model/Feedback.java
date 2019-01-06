package com.zking.ssm.model;

import java.util.Date;

public class Feedback {
    private Integer feedbackId;

    private Long userId;

    private String feedbackContent;

    private Date feedbackDate;

    public Feedback(Integer feedbackId, Long userId, String feedbackContent, Date feedbackDate) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.feedbackContent = feedbackContent;
        this.feedbackDate = feedbackDate;
    }

    public Feedback() {
        super();
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }
}