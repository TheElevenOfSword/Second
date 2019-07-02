package com.cocoiso.utils;

import java.io.Serializable;

/**
 * 返回参数
 * @author 纪先生
 *
 * 2019年：下午10:29:56
 */
public class ReturnParam implements Serializable{
	
    // 响应的业务状态，正确为‘200’
    private Integer status;

    // 响应回去的消息
    private String msg;

    // 响应回去的数据
    private Object data;
    
    
    public ReturnParam() {
		super();
	}
    
    public ReturnParam(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    
    public ReturnParam(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }
    
    //正确情况，返回三个参数
    public static ReturnParam build(Integer status, String msg, Object data) {
        return new ReturnParam(status, msg, data);
    }

    //正确情况，返回数据
	public static ReturnParam ok(Object data) {
        return new ReturnParam(data);
    }

	//正确情况，无返回
    public static ReturnParam ok() {
        return new ReturnParam(null);
    }

    //正确情况，返回状态码和消息，无数据
    public static ReturnParam build(Integer status, String msg) {
        return new ReturnParam(status, msg, null);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
