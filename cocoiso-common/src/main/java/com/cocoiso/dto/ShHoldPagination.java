package com.cocoiso.dto;

import java.math.BigDecimal;

import com.cocoiso.pojo.ShUser;

public class ShHoldPagination {
	
    private Integer hid;

    private String hname;

    private BigDecimal hprice;

    private Integer hnum;

    private String himage;

    private String hdesc;
    
    private Integer hstate;
    
    private ShUser shUser;

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public BigDecimal getHprice() {
		return hprice;
	}

	public void setHprice(BigDecimal hprice) {
		this.hprice = hprice;
	}

	public Integer getHnum() {
		return hnum;
	}

	public void setHnum(Integer hnum) {
		this.hnum = hnum;
	}

	public String getHimage() {
		return himage;
	}

	public void setHimage(String himage) {
		this.himage = himage;
	}

	public String getHdesc() {
		return hdesc;
	}

	public void setHdesc(String hdesc) {
		this.hdesc = hdesc;
	}

	public Integer getHstate() {
		return hstate;
	}

	public void setHstate(Integer hstate) {
		this.hstate = hstate;
	}

	public ShUser getShUser() {
		return shUser;
	}

	public void setShUser(ShUser shUser) {
		this.shUser = shUser;
	}

	@Override
	public String toString() {
		return "ShHoldPagination [hid=" + hid + ", hname=" + hname + ", hprice=" + hprice + ", hnum=" + hnum
				+ ", himage=" + himage + ", hdesc=" + hdesc + ", hstate=" + hstate + ", shUser=" + shUser + "]";
	}
    
    
}