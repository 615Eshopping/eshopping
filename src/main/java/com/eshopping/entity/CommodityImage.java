package com.eshopping.entity;

import java.util.Arrays;

public class CommodityImage {
    private Integer commodityId;

    private byte[] image;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CommodityImage{" +
                "commodityId=" + commodityId +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}