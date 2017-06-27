package com.ishui.beans;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public DemoEvent(Object source,String msg) {
		super(source);
		//System.out.println(source.toString());
		this.msg = msg;
		// TODO Auto-generated constructor stub
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		System.out.println("我是DemoEvent");
		return super.toString();
	}
	

}
