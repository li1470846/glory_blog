package com.zking.ssm.model;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Long userId;

    private Integer goodsId;

    private Date goodsDate;

    public Order(Integer orderId, Long userId, Integer goodsId, Date goodsDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsDate = goodsDate;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }
}