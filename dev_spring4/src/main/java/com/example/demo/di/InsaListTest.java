package com.example.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaListTest {

	public static void main(String[] args) {
		
		//스프링을 경유하기 위해 필요한 것 -> 스프링을 경유하기 위한 고급기술이다
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com\\example\\demo\\di\\insaBean.xml");
		//주입받을 때 쓰는 메소드는 getBean이다
		InsaList InsaList = (InsaList)context.getBean("insa"); //주입받을때는 bean의 id를 데리고와야한다
		//이 코드를 우리가 사용한 이유 :  객체 주입하기 위해서이다
		System.out.println(InsaList.insaBean);
		//
		for(int i = 0; i<InsaList.insaBean.size(); i++) {
			System.out.println(InsaList.insaBean.get(i));
		}
		
	}

}
