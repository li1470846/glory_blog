package com.zking.ssm.model;

public class Attention {
    private Integer attentionId;

    private Long userId;

    private Long attentionUserId;

    public Attention(Integer attentionId, Long userId, Long attentionUserId) {
        this.attentionId = attentionId;
        this.userId = userId;
        this.attentionUserId = attentionUserId;
    }

    public Attention() {
        super();
    }

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(Long attentionUserId) {
        this.attentionUserId = attentionUserId;
    }
}