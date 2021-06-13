package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller : 얘는 컨트롤러의 역할을 할 수 있게 됨.
@Controller
public class SampleController1 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController1.class);

	// 실행하고자 하는 동작을 메서드로 표현 -> 메서드마다 주소 매핑
	// 스프링이 자동으로 매핑된 메서드에 view 페이지를 연결

	// * 구현한 메서드의 리턴타입이 void 일 때 가상주소.jsp 뷰페이지 연결
	// => WEB-INF/views/ 파일생성하면 연결됨

	// http://localhost:8080/web/doA1
	@RequestMapping("/doA1")
	public void doA() {
		logger.info("doA() 메서드 실행!");
	}

	// doB 주소를 매핑해서 doB.jsp 페이지에 "안녕하세요" 출력
	// http://localhost:8080/web/doB
		@RequestMapping("/doB")
		public void doB() {
			logger.info("doB() 메서드 실행!");
		

	}

}
