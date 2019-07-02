package com.cocoiso.dto;

import java.math.BigDecimal;

import com.cocoiso.pojo.ShProduct;
import com.cocoiso.pojo.ShUser;

public class ShCartOther {
	
    private Integer cartid;

    private ShUser shUser;

    private ShProduct shProduct;

    private Integer num;

    private BigDecimal price;


	public ShCartOther() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShCartOther(Integer cartid, ShUser shUser, ShProduct shProduct, Integer num, BigDecimal price) {
		super();
		this.cartid = cartid;
		this.shUser = shUser;
		this.shProduct = shProduct;
		this.num = num;
		this.price = price;
	}

	public Integer getCartid() {
		return cartid;
	}

	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}

	public ShUser getShUser() {
		return shUser;
	}

	public void setShUser(ShUser shUser) {
		this.shUser = shUser;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShCartOther [cartid=" + cartid + ", shUser=" + shUser + ", shProduct=" + shProduct + ", num=" + num
				+ ", price=" + price + "]";
	}
    

}
