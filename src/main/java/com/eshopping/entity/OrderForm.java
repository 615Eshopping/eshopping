package com.eshopping.entity;

import java.util.Date;

/**
 * Created by AnKh on 2017/2/20.
 */
public class OrderForm {
    private Integer orderFormId;	//订单编号
    private User user;				//用户信息
    private String orderFormNo;		//订单序号
    private Date submitTime;		//提交订单时间
    private Date consignmentTime;	//发货时间
    private Double totalPrice;		//总金额
    private String remark;			//买家备注
    private String ipAddress;		//买家IP地址
    private Integer isPayoff;		//买家是否付款
    private Integer isConsignment;	//是否发货

    public Integer getOrderFormId() {
        return orderFormId;
    }

    public void setOrderFormId(Integer orderFormId) {
        this.orderFormId = orderFormId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrderFormNo() {
        return orderFormNo;
    }

    public void setOrderFormNo(String orderFormNo) {
        this.orderFormNo = orderFormNo;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getConsignmentTime() {
        return consignmentTime;
    }

    public void setConsignmentTime(Date consignmentTime) {
        this.consignmentTime = consignmentTime;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getIsPayoff() {
        return isPayoff;
    }

    public void setIsPayoff(Integer isPayoff) {
        this.isPayoff = isPayoff;
    }

    public Integer getIsConsignment() {
        return isConsignment;
    }

    public void setIsConsignment(Integer isConsignment) {
        this.isConsignment = isConsignment;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "orderFormId=" + orderFormId +
                ", user=" + user +
                ", orderFormNo='" + orderFormNo + '\'' +
                ", submitTime=" + submitTime +
                ", consignmentTime=" + consignmentTime +
                ", totalPrice=" + totalPrice +
                ", remark='" + remark + '\'' +
                ", ipaddress='" + ipAddress + '\'' +
                ", isPayoff=" + isPayoff +
                ", isConsignment=" + isConsignment +
                '}';
    }
}
