package com.zking.ssm.model;

public class Goods {
    private Integer goodsId;

    private String goodsType;

    private String goodsName;

    private String goodsImage;

    private Integer goodsCount;

    private Integer goodsFreeSize;

    private Float goodsPrice;

    public Goods(Integer goodsId, String goodsType, String goodsName, String goodsImage, Integer goodsCount, Integer goodsFreeSize, Float goodsPrice) {
        this.goodsId = goodsId;
        this.goodsType = goodsType;
        this.goodsName = goodsName;
        this.goodsImage = goodsImage;
        this.goodsCount = goodsCount;
        this.goodsFreeSize = goodsFreeSize;
        this.goodsPrice = goodsPrice;
    }

    public Goods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getGoodsFreeSize() {
        return goodsFreeSize;
    }

    public void setGoodsFreeSize(Integer goodsFreeSize) {
        this.goodsFreeSize = goodsFreeSize;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}