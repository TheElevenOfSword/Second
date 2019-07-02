package com.cocoiso.utils;

import java.io.Serializable;
import java.util.List;

public class EUPaginationParam implements Serializable{
	
	//返回 total总记录数
	private Integer total;
	
	//返回List集合：rows，里面封装全部信息
	private List rows;

	public EUPaginationParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EUPaginationParam(Integer total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
