package com.sf.entity;


//商品实体表
public class GridsEntity {
	public String gridsID;//商品ID
	public String girdsName;//商品名字
	public String girdsPrice;//商品价格
	public String girdsImg;//商品图片地址
	public int    girdsStorage;//商品库存

	public String getGridsID() {
		return gridsID;
	}

	public void setGridsID(String gridsID) {
		this.gridsID = gridsID;
	}

	public String getGirdsName() {
		return girdsName;
	}

	public void setGirdsName(String girdsName) {
		this.girdsName = girdsName;
	}

	public String getGirdsPrice() {
		return girdsPrice;
	}

	public void setGirdsPrice(String girdsPrice) {
		this.girdsPrice = girdsPrice;
	}

	public String getGirdsImg() {
		return girdsImg;
	}

	public void setGirdsImg(String girdsImg) {
		this.girdsImg = girdsImg;
	}

	public int getGirdsStorage() {
		return girdsStorage;
	}

	public void setGirdsStorage(int girdsStorage) {
		this.girdsStorage = girdsStorage;
	}
}
