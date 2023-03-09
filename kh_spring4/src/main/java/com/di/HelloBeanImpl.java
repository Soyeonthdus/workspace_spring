package com.di;

public class HelloBeanImpl implements HelloBean {
	// 아래 코드 추가하면 helloBean.xml에서 6번째 줄 오류남 해결됨
	String msg = null;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	@Override
	public String getGreeting(String msg) {
		return "Spring" + msg;
	}
}
