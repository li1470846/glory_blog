package com.zking.ssm.model;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private String userNickName;

    private String userSex;

    private String userRealName;

    private Date userBirthday;

    private String userRegion;

    private String userTrade;

    private String userPosition;

    private String userDesc;

    private String userImage;

    private Integer userIntegral;

    private Integer identityId;

    private Integer todayDownloadSize;

    private Integer freeDownloadSize;

    private Date vipBeginDate;

    private Date vipEndDate;

    private Integer userState;

    public User(Long userId, String userName, String userPassword, String userPhone, String userNickName, String userSex, String userRealName, Date userBirthday, String userRegion, String userTrade, String userPosition, String userDesc, String userImage, Integer userIntegral, Integer identityId, Integer todayDownloadSize, Integer freeDownloadSize, Date vipBeginDate, Date vipEndDate, Integer userState) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userNickName = userNickName;
        this.userSex = userSex;
        this.userRealName = userRealName;
        this.userBirthday = userBirthday;
        this.userRegion = userRegion;
        this.userTrade = userTrade;
        this.userPosition = userPosition;
        this.userDesc = userDesc;
        this.userImage = userImage;
        this.userIntegral = userIntegral;
        this.identityId = identityId;
        this.todayDownloadSize = todayDownloadSize;
        this.freeDownloadSize = freeDownloadSize;
        this.vipBeginDate = vipBeginDate;
        this.vipEndDate = vipEndDate;
        this.userState = userState;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserTrade() {
        return userTrade;
    }

    public void setUserTrade(String userTrade) {
        this.userTrade = userTrade;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public Integer getTodayDownloadSize() {
        return todayDownloadSize;
    }

    public void setTodayDownloadSize(Integer todayDownloadSize) {
        this.todayDownloadSize = todayDownloadSize;
    }

    public Integer getFreeDownloadSize() {
        return freeDownloadSize;
    }

    public void setFreeDownloadSize(Integer freeDownloadSize) {
        this.freeDownloadSize = freeDownloadSize;
    }

    public Date getVipBeginDate() {
        return vipBeginDate;
    }

    public void setVipBeginDate(Date vipBeginDate) {
        this.vipBeginDate = vipBeginDate;
    }

    public Date getVipEndDate() {
        return vipEndDate;
    }

    public void setVipEndDate(Date vipEndDate) {
        this.vipEndDate = vipEndDate;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }
}