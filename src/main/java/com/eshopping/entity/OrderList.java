package com.eshopping.entity;

/**
 * Created by AnKh on 2017/2/20.
 */
public class OrderList {
    private Integer orderListId;	//订单列表编号
    private Commodity commodity;	//商品信息
    private OrderForm orderForm;	//订单信息
    private Integer amount;			//商品数量

    public Integer getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Integer orderListId) {
        this.orderListId = orderListId;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public OrderForm getOrderForm() {
        return orderForm;
    }

    public void setOrderForm(OrderForm orderForm) {
        this.orderForm = orderForm;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orderListId=" + orderListId +
                ", commodity=" + commodity +
                ", orderForm=" + orderForm +
                ", amount=" + amount +
                '}';
    }
}
