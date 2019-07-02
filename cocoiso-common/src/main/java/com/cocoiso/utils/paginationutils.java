package com.cocoiso.utils;

import java.util.List;

/*
 * 存放分页的相关数据
 * 
 */
public class paginationutils {
	
	//select * from product where cid=？ limit ？，？
	private int currentPageNum; //当前页数，用户输入的
	private int totalRecords; //总记录数，数据库中查出来的
	private int totalPageNum; //总页数，需要计算出来的    （总记录数/当前页的记录数）
	private int pageSize=5; //当前页的记录数
	
	private int startIndex; //起始索引，需要计算  （当前页数-1）*当前页的记录数
	private int prePageNum; //上一页
	private int nextPageNum; //下一页
	
	private List list; //存储product/order集合
	
	private int startPageNum; //开始页数
	private int endPageNum; //结束页数
	
	private String url;
	
	//使用有参构造方式，需要传递三个参数进来才能使用，当前页数/总记录数/当前页的记录数
	public paginationutils(int currentPageNum,int totalRecords,int pageSize){
		this.currentPageNum = currentPageNum;
		this.totalRecords = totalRecords;
		this.pageSize = pageSize;
		
		//计算起始索引
		startIndex = (currentPageNum - 1) * pageSize;
		//计算总页数
		totalPageNum = (totalRecords%pageSize) == 0 ? (totalRecords/pageSize) : (totalRecords/pageSize)+1;
		//计算上一页
		prePageNum = currentPageNum - 1;
		//计算下一页
		nextPageNum = currentPageNum + 1;
		//开始页数
		startPageNum = currentPageNum - 4;
		//结束页数
		endPageNum = currentPageNum + 4;
		
		//每页显示9条
		//如果总页数大于9页
		if(totalPageNum > 9 ){ 
			if(startPageNum < 1){
				startPageNum = 1;
				endPageNum = startPageNum + 8;
			}
			if(endPageNum > totalPageNum){
				endPageNum = totalPageNum;
				startPageNum = endPageNum - 8;
			}
		}else{
			//总页数不够9页
			startPageNum = 1;
			endPageNum = totalPageNum;
		}
		
	}

	public int getCurrentPageNum() {
		return currentPageNum;
	}

	public void setCurrentPageNum(int currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPrePageNum() {
		return prePageNum;
	}

	public void setPrePageNum(int prePageNum) {
		this.prePageNum = prePageNum;
	}

	public int getNextPageNum() {
		return nextPageNum;
	}

	public void setNextPageNum(int nextPageNum) {
		this.nextPageNum = nextPageNum;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getStartPageNum() {
		return startPageNum;
	}

	public void setStartPageNum(int startPageNum) {
		this.startPageNum = startPageNum;
	}

	public int getEndPageNum() {
		return endPageNum;
	}

	public void setEndPageNum(int endPageNum) {
		this.endPageNum = endPageNum;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "PageModel [currentPageNum=" + currentPageNum + ", totalRecords=" + totalRecords + ", totalPageNum="
				+ totalPageNum + ", pageSize=" + pageSize + ", startIndex=" + startIndex + ", prePageNum=" + prePageNum
				+ ", nextPageNum=" + nextPageNum + ", startPageNum=" + startPageNum + ", endPageNum=" + endPageNum
				+ ", url=" + url + "]";
	}
	
	
}
