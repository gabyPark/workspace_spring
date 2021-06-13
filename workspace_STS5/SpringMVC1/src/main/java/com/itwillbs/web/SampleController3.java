package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwillbs.domain.ProductVO;

@Controller
public class SampleController3 {
	private static final Logger logger 
	= LoggerFactory.getLogger(SampleController3.class);
	
	
	// Model 클래스 : 스프링에서 제공하는 클래스
	// => 컨테이너 역할을 한다. 원하는 데이터를 뷰페이지에 전달하기 위한 객체
	
	
	
	// http://localhost:8080/web/doD
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		logger.info(" /doD 주소 호출! ");
		
		logger.info("객체 정보를 생성후 저장");
		
		ProductVO vo = new ProductVO("phone", 100, "s20");
		logger.info("vo: "+vo);	
		
		//model.addAttribute("vo", vo);
		model.addAttribute(vo);
		
		
		logger.info("페이지 이동");
		
		return "itwill";
	}

}
