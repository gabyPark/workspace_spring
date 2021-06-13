package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController2.class);
	
	
	// 동작
	@RequestMapping("/doC")
	public String doC() {
		logger.info("/doC 주소 호출!");
		logger.info("String 타입 리턴 -> 리턴값.jsp 페이지 호출!");
		
		return "itwillbusan";
	}

	
	// http://localhost:8080/web/doC1?msg=hello
	@RequestMapping("/doC1")
	public String doC1(@ModelAttribute("msg")String msg) {
		logger.info("/doC1 주소 호출!");
		logger.info("String 타입 리턴 -> 리턴값.jsp 페이지 호출!");
		
		logger.info("msg : "+msg);
		
		return "itwillbusan";
	}

	
	// @ModelAttribute("msg1")
	// => 페이지 요청시 이름에 해당하는 정보를 가지고 
	// 뷰 페이지까지 이동 => spring 자동으로 처리
	
	
	// http://localhost:8080/web/doC2?msg1=hello
	@RequestMapping("/doC2")
	public String doC2(@ModelAttribute("msg1") String msg) {
		logger.info("/doC2 주소 호출!");
		logger.info("String 타입 리턴 -> 리턴값.jsp 페이지 호출!");
		
		return "itwillbusan";
	}
	
	
	// doC3() => 전달값 2개	
	// http://localhost:8080/web/doC3?msg1=hello&msg2=1234
	@RequestMapping("/doC3")
	public String doC3(@ModelAttribute("msg1") String msg,
						@ModelAttribute("msg2") String msg2) {
		logger.info("/doC3 주소 호출!");
		logger.info("String 타입 리턴 -> 리턴값.jsp 페이지 호출!");
		
		return "itwillbusan";
	}
	
	
}
