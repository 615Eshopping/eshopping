package com.eshopping.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by AnKh on 2017/2/20.
 */

public class Commodity {
    private Integer commodityId;			//商品编号
    private String commodityName;			//商品名称
    private CommodityClass commodityClass;	//商品种类
    private String manufacturer;			//生产厂家
    private String commodityDepict;			//商品描述
    private BigDecimal commodityPrice;			//商品价格
    private BigDecimal fcPrice;					//帆成网价格
    private Integer commodityAmount;		//商品总数量
    private Integer commodityLeaveNum;		//商品剩余数量
    private Date regTime;					//商品上架时间
    private byte[] image;						//商品图片

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public CommodityClass getCommodityClass() {
        return commodityClass;
    }

    public void setCommodityClass(CommodityClass commodityClass) {
        this.commodityClass = commodityClass;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCommodityDepict() {
        return commodityDepict;
    }

    public void setCommodityDepict(String commodityDepict) {
        this.commodityDepict = commodityDepict;
    }


    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public BigDecimal getFcPrice() {
        return fcPrice;
    }

    public void setFcPrice(BigDecimal fcPrice) {
        this.fcPrice = fcPrice;
    }

    public Integer getCommodityAmount() {
        return commodityAmount;
    }

    public void setCommodityAmount(Integer commodityAmount) {
        this.commodityAmount = commodityAmount;
    }

    public Integer getCommodityLeaveNum() {
        return commodityLeaveNum;
    }

    public void setCommodityLeaveNum(Integer commodityLeaveNum) {
        this.commodityLeaveNum = commodityLeaveNum;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId=" + commodityId +
                ", commodityClass=" + commodityClass +
                ", commodityName='" + commodityName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", commodityDepict='" + commodityDepict + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", fcPrice=" + fcPrice +
                ", commodityAmount=" + commodityAmount +
                ", commodityLeaveNum=" + commodityLeaveNum +
                ", regTime=" + regTime +
                '}';
    }
}
