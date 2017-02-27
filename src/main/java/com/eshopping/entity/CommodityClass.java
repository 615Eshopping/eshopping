package com.eshopping.entity;

/**
 * Created by AnKh on 2017/2/20.
 */
public class CommodityClass {
    private Integer commodityClassId;		//商品种类编号
    private String commodityClassName;		//商品种类名称

    public Integer getCommodityClassId() {
        return commodityClassId;
    }

    public void setCommodityClassId(Integer commodityClassId) {
        this.commodityClassId = commodityClassId;
    }

    public String getCommodityClassName() {
        return commodityClassName;
    }

    public void setCommodityClassName(String commodityClassName) {
        this.commodityClassName = commodityClassName;
    }

    @Override
    public String toString() {
        return "CommodityClass{" +
                "commodityClassId=" + commodityClassId +
                ", commodityClassName='" + commodityClassName + '\'' +
                '}';
    }
}
