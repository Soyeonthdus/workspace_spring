package com.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain {
	
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("D:\\workspace_spring\\kh_spring4\\src\\main\\java\\com\\di\\helloBean.xml");
		//Spring Container 는 두 가지 유형의 컨테이너 제공ㅎ
		//spring-beams.jar에 살고 있음
		//모든 빈을 늦게 로딩함
		BeanFactory factory = new XmlBeanFactory(resource);
		//제어역전, 의존성 주입, scope
		HelloBean helloBean = (HelloBean)factory.getBean("helloBean"); //객체를 생성함 new가 없어야됨
		System.out.println(helloBean.getGreeting("안녕"));
		//spring-context.jar에 살고 있음
		//Context 시작시킬 때 모두 singleton 빈을 미리 로딩함으로써
		//그 빈이 필요할 때 즉시 사용될 수 있도록 보장해줌
		//어플리케이션 동작시 Bean 생성되기를 기다릴 필요가 없게됨
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\di\\helloBean.xml");
		HelloBean helloBean2 = (HelloBean)context.getBean("helloBean");
		System.out.println(helloBean2.getGreeting("잘가"));
	}
}