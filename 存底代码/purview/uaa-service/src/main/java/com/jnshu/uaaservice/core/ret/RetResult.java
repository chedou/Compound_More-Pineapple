package com.jnshu.uaaservice.core.ret;


import java.util.*;

/**
 * @program: morepineapple
 * @description: 返回对象实体
 * @author: Mr.huang
 * @create: 2018-10-14 21:36
 **/
public class RetResult<T> {

	private int code;

	private String msg;

	private T data;

	// public RetResult(Integer code, String msg) {
	// 	this.code = code;
	// 	this.msg = msg;
	// }

	public RetResult() {}

	public RetResult<T> setCode(RetCode retCode) {
		this.code = retCode.code;
		return this;
	}

	public int getCode() {
		return code;
	}

	RetResult<T> setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public RetResult<T> setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public T getData() {
		return data;
	}

	public RetResult<T> setData(T data) {
		this.data = data;
		return this;
	}

	public RetResult<T> setData(T... datas) {
		List<T> dataAll = new ArrayList<>();
		Collections.addAll(dataAll, datas);
		this.data = (T) dataAll;
		return this;
	}


	@Override
	public String toString() {
		return "RetResult{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				", data=" + data +
				'}';
	}
}
