package com.zking.ssm.model;

public class ResourceType {
    private Integer resourceTypeId;

    private String resourceTypeName;

    public ResourceType(Integer resourceTypeId, String resourceTypeName) {
        this.resourceTypeId = resourceTypeId;
        this.resourceTypeName = resourceTypeName;
    }

    public ResourceType() {
        super();
    }

    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(Integer resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }
}