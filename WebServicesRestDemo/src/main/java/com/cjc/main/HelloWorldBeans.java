package com.cjc.main;

public class HelloWorldBeans {

	private String msg;

	public HelloWorldBeans(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloWorldBeans [msg=" + msg + "]";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
