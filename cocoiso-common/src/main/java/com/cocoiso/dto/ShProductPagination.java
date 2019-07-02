package com.cocoiso.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.cocoiso.pojo.ShCategory;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ShProductPagination {
	
	private Integer pid;

    private String pname;

    private BigDecimal price;

    private Integer pnum;

    private String pimage;

    private Date pdate;

    private Integer pstate;

    private Integer isHot;

    private String pdesc;
    
    private ShCategory shCategory;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getPnum() {
		return pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

    //将Date转化为String，传给前端可用
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public Integer getPstate() {
		return pstate;
	}

	public void setPstate(Integer pstate) {
		this.pstate = pstate;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public ShCategory getShCategory() {
		return shCategory;
	}

	public void setShCategory(ShCategory shCategory) {
		this.shCategory = shCategory;
	}
    
}
