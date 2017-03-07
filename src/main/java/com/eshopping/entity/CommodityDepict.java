package com.eshopping.entity;

public class CommodityDepict {
    private Integer commodityId;

    private String commodityDepict;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityDepict() {
        return commodityDepict;
    }

    public void setCommodityDepict(String commodityDepict) {
        this.commodityDepict = commodityDepict;
    }

    @Override
    public String toString() {
        return "CommodityDepict{" +
                "commodityId=" + commodityId +
                ", commodityDepict='" + commodityDepict + '\'' +
                '}';
    }
}