package com.zking.ssm.model;

import java.util.Date;

public class Resource {
    private Integer resourceId;

    private Long userId;

    private Integer resourceTypeId;

    private Integer resourceClassfyId;

    private String resourceName;

    private String resourceSuffix;

    private String resourceSize;

    private String resourceUrl;

    private String resourceDesc;

    private Date resourceDate;

    private Integer resourceIntegral;

    private Integer resourceCount;

    public Resource(Integer resourceId, Long userId, Integer resourceTypeId, Integer resourceClassfyId, String resourceName, String resourceSuffix, String resourceSize, String resourceUrl, String resourceDesc, Date resourceDate, Integer resourceIntegral, Integer resourceCount) {
        this.resourceId = resourceId;
        this.userId = userId;
        this.resourceTypeId = resourceTypeId;
        this.resourceClassfyId = resourceClassfyId;
        this.resourceName = resourceName;
        this.resourceSuffix = resourceSuffix;
        this.resourceSize = resourceSize;
        this.resourceUrl = resourceUrl;
        this.resourceDesc = resourceDesc;
        this.resourceDate = resourceDate;
        this.resourceIntegral = resourceIntegral;
        this.resourceCount = resourceCount;
    }

    public Resource() {
        super();
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(Integer resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public Integer getResourceClassfyId() {
        return resourceClassfyId;
    }

    public void setResourceClassfyId(Integer resourceClassfyId) {
        this.resourceClassfyId = resourceClassfyId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceSuffix() {
        return resourceSuffix;
    }

    public void setResourceSuffix(String resourceSuffix) {
        this.resourceSuffix = resourceSuffix;
    }

    public String getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(String resourceSize) {
        this.resourceSize = resourceSize;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceDesc() {
        return resourceDesc;
    }

    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    public Date getResourceDate() {
        return resourceDate;
    }

    public void setResourceDate(Date resourceDate) {
        this.resourceDate = resourceDate;
    }

    public Integer getResourceIntegral() {
        return resourceIntegral;
    }

    public void setResourceIntegral(Integer resourceIntegral) {
        this.resourceIntegral = resourceIntegral;
    }

    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }
}