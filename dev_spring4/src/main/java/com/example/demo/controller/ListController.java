package com.example.demo.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListController extends AbstractController {
	//전역변수
	Logger logger = LoggerFactory.getLogger(ListController.class);
	public List<String> insaBean2 = null;
	
	//메소드
	public void setInsaBean2(List<String> insaBean2) {
		this.insaBean2 = insaBean2;
	}
	
	//메소드의 파라미터로 요청객체와 응답객체를 주입받고 있다는 것은 서블릿에 의존적인 프레임워크를 의미함
	//스프링부트에서는 요청객체, 응답객체 아예 없어도 실행됨
	//객체를 주입받기위해 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav= new ModelAndView();
		mav.addObject("insaBean", insaBean2);
		mav.setViewName("di/insaList");
		return mav;
	}

}
