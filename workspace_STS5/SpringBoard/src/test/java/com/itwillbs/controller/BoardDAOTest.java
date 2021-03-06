package com.itwillbs.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}		
		)
public class BoardDAOTest {

	// DAO 객체 생성 -> 주입
	// 주입을 하려면 원래 대상을 찾으러 root-context.xml 가야함
	// SqlSession 객체가 있는 BoardImple 객체로 간다
	
	
	@Inject
	private BoardDAO bdao;
	
	@Test
	public void testCreate() throws Exception{
		System.out.println("테스트 실행");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트용 글");
		vo.setContent("테스트입니다");
		vo.setWriter("관리자");
		
		// Impl > SqlSession > Mapper > 구문 실행 > Impl 가서 종료 > 호출했던 Test로 다시 돌아옴
		
		bdao.create(vo);
	}
	
}
