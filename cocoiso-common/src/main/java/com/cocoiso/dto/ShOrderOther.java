package com.cocoiso.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.cocoiso.pojo.ShUser;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ShOrderOther {

	private String orderid;

	private ShUser shUser;

	private Date ordertime;

	private BigDecimal subtotal;

	private Integer state;

	private String realname;

	private String address;

	private String telephone;

	/*private List<ShOrderitemOther> list = new ArrayList<>();*/

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public ShUser getShUser() {
		return shUser;
	}

	public void setShUser(ShUser shUser) {
		this.shUser = shUser;
	}

	// 将Date转化为String，传给前端可用
	// 数据类型为datetime，有小时分钟秒
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

/*	public List<ShOrderitemOther> getList() {
		return list;
	}

	public void setList(List<ShOrderitemOther> list) {
		this.list = list;
	}*/

	
	@Override
	public String toString() {
		return "ShOrderOther [orderid=" + orderid + ", shUser=" + shUser + ", ordertime=" + ordertime + ", subtotal="
				+ subtotal + ", state=" + state + ", realname=" + realname + ", address=" + address + ", telephone="
				+ telephone + "]";
	}

}
