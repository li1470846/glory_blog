package com.zking.ssm.model;

public class Identity {
    private Integer identityId;

    private String identityName;

    private Integer identityDiscount;

    private Integer identityDownloadCount;

    private Integer identityUploadSize;

    public Identity(Integer identityId, String identityName, Integer identityDiscount, Integer identityDownloadCount, Integer identityUploadSize) {
        this.identityId = identityId;
        this.identityName = identityName;
        this.identityDiscount = identityDiscount;
        this.identityDownloadCount = identityDownloadCount;
        this.identityUploadSize = identityUploadSize;
    }

    public Identity() {
        super();
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    public Integer getIdentityDiscount() {
        return identityDiscount;
    }

    public void setIdentityDiscount(Integer identityDiscount) {
        this.identityDiscount = identityDiscount;
    }

    public Integer getIdentityDownloadCount() {
        return identityDownloadCount;
    }

    public void setIdentityDownloadCount(Integer identityDownloadCount) {
        this.identityDownloadCount = identityDownloadCount;
    }

    public Integer getIdentityUploadSize() {
        return identityUploadSize;
    }

    public void setIdentityUploadSize(Integer identityUploadSize) {
        this.identityUploadSize = identityUploadSize;
    }
}