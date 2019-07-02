package com.cocoiso.dto;

import java.math.BigDecimal;

import com.cocoiso.pojo.ShProduct;

public class ShOrderitemOther {

	private Integer orderitemid;

	private String orderid;

	private ShProduct shProduct;

	private Integer num;

	private BigDecimal total;

	public Integer getOrderitemid() {
		return orderitemid;
	}

	public void setOrderitemid(Integer orderitemid) {
		this.orderitemid = orderitemid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public ShProduct getShProduct() {
		return shProduct;
	}

	public void setShProduct(ShProduct shProduct) {
		this.shProduct = shProduct;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ShOrderitemOther [orderitemid=" + orderitemid + ", orderid=" + orderid + ", shProduct=" + shProduct
				+ ", num=" + num + ", total=" + total + "]";
	}

}
