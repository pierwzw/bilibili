package com.sf.entity;


//订单实体表
public class OrderTableEntity {
	
	
	/*		
	订单状态:
		1      为: 代发货
		2      为: 已发货
		3      为: 退货中
		4      为: 订单取消*/
	
	
	public String orderId;//订单ID
	public String orderUserName;//订单人名字
	public String orderGridsName;//订单商品名字
	public String orderGridsImg;//订单商品图片
	public String orderTotalPrice;//订单总价格
	public String orderState;//订单状态
	public String orderTime;//订单时间
	public String orderAddr;//订单收货地址

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderUserName() {
		return orderUserName;
	}

	public void setOrderUserName(String orderUserName) {
		this.orderUserName = orderUserName;
	}

	public String getOrderGridsName() {
		return orderGridsName;
	}

	public void setOrderGridsName(String orderGridsName) {
		this.orderGridsName = orderGridsName;
	}

	public String getOrderGridsImg() {
		return orderGridsImg;
	}

	public void setOrderGridsImg(String orderGridsImg) {
		this.orderGridsImg = orderGridsImg;
	}

	public String getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(String orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderAddr() {
		return orderAddr;
	}

	public void setOrderAddr(String orderAddr) {
		this.orderAddr = orderAddr;
	}
}
