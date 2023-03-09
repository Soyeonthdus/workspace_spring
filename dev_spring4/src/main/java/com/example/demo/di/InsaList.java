package com.example.demo.di;

import java.util.List;

public class InsaList {
	//전역변수
	public List<String> insaBean = null;
	
	//생성자 객체 주입법 코드(car.xml에 있는 것)와 setter객체 주입법 코드가 있다
	//밑에는 setter객체 주입법 코드
	//사실 spring boot에서는 @Autowired어노테이션 사용으로 필요가 없어졌다(req와 res가 필요없다는 의미)
	//beans에는 beanFactory가 applicationContext에는 있고 applicationFactory가 있다
	// 사실상 insaBean = new ArrayList<>(); 를 해주고 있는것
	//하지만 이렇게 쓰는 이유 -> 라이프사이클을 관리해주기때문에
	//메소드
	public void setInsaBean(List<String> insaBean) {
		this.insaBean = insaBean;
	}
	
}
