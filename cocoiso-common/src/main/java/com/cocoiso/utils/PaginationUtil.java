package com.cocoiso.utils;

import java.io.Serializable;
import java.util.List;

public class PaginationUtil implements Serializable {
	
	//当前页数，前端传递过来的
	private int currentPage;
	
	//总页数，算出来的：总记录数/每页显示的记录数
	private int totalPage;
	
	//每页显示的记录数，自己给值
	private int pageSize;
	
	//总记录数，查出来的
	private int totalPageSize;
	
	//当前页的数据集合
	private List list;
	
	//开始页码，随动
	private int startPage;
	
	//结束页码，随动
	private int endPage;
	
	/**
	 * 通过构造函数传入三个值，来计算其他值
	 * @param currentPage
	 * @param totalPageSize：需数据库查出来的
	 * @param pageSize
	 */
	public PaginationUtil(int currentPage,int totalPageSize,int pageSize){
		this.currentPage = currentPage;
		this.totalPageSize = totalPageSize;
		this.pageSize = pageSize;
		
		//总页数，算出来的：总记录数/每页显示的记录数
		totalPage = (totalPageSize%pageSize ==0) ? 
				(totalPageSize/pageSize) : (totalPageSize/pageSize)+1 ;
		
		//起始页码 ：1 2 3 4 5 6 
		startPage = currentPage - 3;
		endPage = currentPage + 3;
		
		//总页数有6页以上
		if(totalPage > 6){
			if(startPage < 1){
				startPage = 1;
				endPage = startPage + 6;
			}
			if(endPage > totalPage){
				endPage = totalPage;
				startPage = endPage - 6;
			}
		}
		//总页数小于6页
		else{
			startPage = 1;
			endPage = totalPage;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPageSize() {
		return totalPageSize;
	}

	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	@Override
	public String toString() {
		return "PaginationUtil [currentPage=" + currentPage + ", totalPage=" + totalPage + ", pageSize=" + pageSize
				+ ", totalPageSize=" + totalPageSize + ", list=" + list + ", startPage=" + startPage + ", endPage="
				+ endPage + "]";
	}
		
	
}
