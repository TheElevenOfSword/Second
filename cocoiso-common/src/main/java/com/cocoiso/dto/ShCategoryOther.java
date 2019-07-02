package com.cocoiso.dto;

import java.io.Serializable;

public class ShCategoryOther implements Serializable {
	
	private Integer cid;
	
	private Integer isParent;
	
	private Integer _parentId;
	
    private String cname;

    private Integer state;

	public ShCategoryOther(Integer cid, Integer isParent, Integer _parentId, String cname, Integer state) {
		super();
		this.cid = cid;
		this.isParent = isParent;
		this._parentId = _parentId;
		this.cname = cname;
		this.state = state;
	}

	public ShCategoryOther() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getIsParent() {
		return isParent;
	}

	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}

	public Integer get_parentId() {
		return _parentId;
	}

	public void set_parentId(Integer _parentId) {
		this._parentId = _parentId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
    
}
