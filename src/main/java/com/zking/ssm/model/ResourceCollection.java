package com.zking.ssm.model;

public class ResourceCollection {
    private Integer resourceCollectionId;

    private Long userId;

    private Integer resourceId;

    public ResourceCollection(Integer resourceCollectionId, Long userId, Integer resourceId) {
        this.resourceCollectionId = resourceCollectionId;
        this.userId = userId;
        this.resourceId = resourceId;
    }

    public ResourceCollection() {
        super();
    }

    public Integer getResourceCollectionId() {
        return resourceCollectionId;
    }

    public void setResourceCollectionId(Integer resourceCollectionId) {
        this.resourceCollectionId = resourceCollectionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}