package com.sf.entity;

//商品实体表
public class ShoppingCart {
	public String cartId; //购物车ID
	public String userName;//购物人名字(账号)
	public String shoppingId;//商品ID
	public String shoppingName;//商品名字
	public String shoppingImg;//商品图片地址
	public String shoppingPrice;//商品价格

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getShoppingId() {
		return shoppingId;
	}

	public void setShoppingId(String shoppingId) {
		this.shoppingId = shoppingId;
	}

	public String getShoppingName() {
		return shoppingName;
	}

	public void setShoppingName(String shoppingName) {
		this.shoppingName = shoppingName;
	}

	public String getShoppingImg() {
		return shoppingImg;
	}

	public void setShoppingImg(String shoppingImg) {
		this.shoppingImg = shoppingImg;
	}

	public String getShoppingPrice() {
		return shoppingPrice;
	}

	public void setShoppingPrice(String shoppingPrice) {
		this.shoppingPrice = shoppingPrice;
	}
}
