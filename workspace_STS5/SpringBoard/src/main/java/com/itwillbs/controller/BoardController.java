package com.itwillbs.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	private BoardService service;

	// http://localhost:8080/register (x)
	// http://localhost:8080/board/register (o)
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registGET(BoardVO vo) throws Exception {

		System.out.println("BoardController_registGET() 호출");
		
		System.out.println("vo : "+vo);
		/*
		 * // 글정보 BoardVO vo = new BoardVO(); vo.setTitle("컨트롤러 실행글");
		 * vo.setContent("컨트롤러 실행 내용"); vo.setWriter("사용자");
		 * 
		 * service.regist(vo);
		 */
		System.out.println("BoardController_registGET() 호출끝");
	}

	// http://localhost:8080/board/register (o)
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO vo) throws Exception {
		// (BoardVO vo) : 전달인자 view 페이지에서 전달된 파라미터를 모두 저장

		System.out.println("BoardController_registPOST()  호출");
		
		System.out.println("vo : "+vo);
		service.regist(vo);
		
		System.out.println("BoardController_registPOST()  호출끝");
		
		// return "/board/success";
		return "redirect:board/listAll"; // 매핑주소 변경 (페이지 전환)
	}
	
	
	// redirect 로 움직일거니까 get 방식
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAllGET() throws Exception{
		
		System.out.println("listAllGET() 호출");
		System.out.println("listAllGET() 호출 끝");
		
	}

}
