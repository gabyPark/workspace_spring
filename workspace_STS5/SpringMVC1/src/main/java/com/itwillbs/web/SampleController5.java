package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwillbs.domain.ProductVO;

@Controller
public class SampleController5 {
	
	private static final Logger logger 
	= LoggerFactory.getLogger(SampleController5.class);

	
	// JSON 데이터 생성
	// http://localhost:8080/web/doJson
	@RequestMapping("/doJson")
	public @ResponseBody ProductVO doJson(){
		logger.info(" /doJson 호출! ");
		
		// 데이터 객체 (DB에서 전달된 데이터)
		ProductVO vo = new ProductVO("휴대폰",100,"삼성");
		return vo;
		
	}
	
}
