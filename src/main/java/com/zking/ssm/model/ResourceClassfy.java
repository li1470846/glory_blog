package com.zking.ssm.model;

public class ResourceClassfy {
    private Integer resourceClassfyId;

    private String resourceClassfyName;

    public ResourceClassfy(Integer resourceClassfyId, String resourceClassfyName) {
        this.resourceClassfyId = resourceClassfyId;
        this.resourceClassfyName = resourceClassfyName;
    }

    public ResourceClassfy() {
        super();
    }

    public Integer getResourceClassfyId() {
        return resourceClassfyId;
    }

    public void setResourceClassfyId(Integer resourceClassfyId) {
        this.resourceClassfyId = resourceClassfyId;
    }

    public String getResourceClassfyName() {
        return resourceClassfyName;
    }

    public void setResourceClassfyName(String resourceClassfyName) {
        this.resourceClassfyName = resourceClassfyName;
    }
}