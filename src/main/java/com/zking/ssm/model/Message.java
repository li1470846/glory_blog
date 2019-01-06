package com.zking.ssm.model;

import java.util.Date;

public class Message {
    private Integer messageId;

    private Long userId;

    private String messageContent;

    private String messageUrl;

    private Date messageDate;

    public Message(Integer messageId, Long userId, String messageContent, String messageUrl, Date messageDate) {
        this.messageId = messageId;
        this.userId = userId;
        this.messageContent = messageContent;
        this.messageUrl = messageUrl;
        this.messageDate = messageDate;
    }

    public Message() {
        super();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageUrl() {
        return messageUrl;
    }

    public void setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }
}