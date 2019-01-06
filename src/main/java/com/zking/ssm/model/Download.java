package com.zking.ssm.model;

import java.util.Date;

public class Download {
    private Integer downloadId;

    private Long userId;

    private Integer resourceId;

    private Date lastUpdateDate;

    public Download(Integer downloadId, Long userId, Integer resourceId, Date lastUpdateDate) {
        this.downloadId = downloadId;
        this.userId = userId;
        this.resourceId = resourceId;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Download() {
        super();
    }

    public Integer getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
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

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}