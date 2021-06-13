package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {

	private static final Logger logger 
	= LoggerFactory.getLogger(SampleController4.class);
	
	// http://localhost:8080/web/doE
	@RequestMapping(path = "/doE")
	public String doE(/* Model model */ RedirectAttributes rttr) {
		logger.info("/doE 주소 호출!");
		
		// return "/doF";		
		// ⭐ 이러면 그냥 doF를 부르는것
		// 주소줄 : /doE - /doE
		// 페이지 : /doF.jsp 	// 컨트롤러 실행 : /doEl
		
		 //return "redirect:/doF?id=itwill";   
		// 주소줄을 /doE -> /doF 호출
		// doE가 먼저 찍혔다가, doE가 doF를 호출하게 됨
		// 주소줄 /doE -> /doF
		// 페이지 : /doF.jsp 	// 컨트롤러 실행 : /doE, /doF
		
		// return "forward:/doF";
		// 주소는 /doE 지만, 
		// doE가 doF를 실행하는 하여 /doF 호출 (포워딩)
		// 주소줄 : /doE -> /doE
		// 페이지 : /doF.jsp		// 컨트롤러 실행 : /doE, /doF
		
		// model.addAttribute("id","itwill1234");
		rttr.addFlashAttribute("id","1234");
		
		return "redirect:/doF";
	}
	
	
	// Model - AddAttribute("k",v);
	// RedirectAttributes - AddFlashAttribute("k",v);
	
	// => 공통점 : 데이터를 뷰 페이지로 전달
	// => 차이점 : 
	//		AddAttribute() - URI 표시 O, 새로고침시 데이터 유지
	// AddFlashAttribute() - URI 표시 X, 새로고침시 데이터 사라짐 (1회성)
	

	@RequestMapping(path = "/doF")
	public void doF(@ModelAttribute("id") String id) {
		logger.info("/doF 주소 호출!");
		logger.info("전달정보 : "+id);
	}
}
