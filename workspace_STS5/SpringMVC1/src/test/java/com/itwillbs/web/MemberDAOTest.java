package com.itwillbs.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class MemberDAOTest {
	
	// DAO 테스트용 파일 (model2 - 액션 페이지 역할)
	
	// DAO 객체를 생성 -> 의존주입
	
	// private MemberDAO mdao = new MemberDAOImpl();  (X)
	@Inject
	private MemberDAO mdao;
	
	// @Test
	public void testGetTime() throws Exception{
		System.out.println("테스트 파일 실행!");
		System.out.println("DB 시간 정보 : "+mdao.getTime());
		System.out.println("테스트 파일 종료!");
	}
		
		
	//@Test	
	public void	insertMemberTest() throws Exception{
		// 회원가입 액션페이지
		
		// 전달받은 회원정보 (원래는 전달받아야하는데 없어서 만들어서 실습하는거)
		MemberVO kim = new MemberVO();
		kim.setUserid("user01");
		kim.setUserpw("1234");
		kim.setUsername("홍길동");
		kim.setUseremail("user01@naver.com");
		
		System.out.println("테스트 : 회원정보 전달");
		
		// DAO 객체 생성 - 메서드 호출
		// => 주입된 객체를 사용
		System.out.println("테스트 : 주입된 DAO 객체 사용 메서드 호출");
		mdao.insertMember(kim);
		
		System.out.println("테스트 : 회원가입 완료");
	
	}
	
	
	// @Test
	public void testGetMember() throws Exception{
		System.out.println("테스트 : 아이디를 사용해서 회원정보 조회");
		
		// 주입된 객체를 사용 (생성된 객체)
		MemberVO vo = mdao.readMember("user01");
		
		System.out.println("테스트 : 조회된 회원정보 "+vo);
		System.out.println("테스트 : 조회된 회원 완료! ");
		
	}
	
	
    // @Test
    public void loginMemberTest() throws Exception {
    	
    	// 전달인자를 받아와야함 -> id,pw 생성
    	String id = "user01";
    	String pw = "1234";
    	
    	// DAO 객체 생성 - 메서드 호출
    	MemberVO vo = mdao.loginMember(id, pw);
    	
    	// 결과에 따라서 로그인여부 판단
    	if(vo != null) {
    		System.out.println("로그인 성공!!!!!!!");
    	}else {
    		System.out.println("로그인 실패!!!!!!!!");
    	}
    }
    
    
   // @Test
    public void updateMemberTest() throws Exception {
    	System.out.println("테스트 : 수정 시작");
    	
    	MemberVO updateVO = new MemberVO();
    	updateVO.setUserid("user01");
    	updateVO.setUserpw("1234");
    	
    	updateVO.setUsername("수정된 이름");
    	
    	mdao.updateMember(updateVO);
    	
    	System.out.println("테스트 : 수정 끝!");
    }	
    
    
    // @Test
    public void deleteMemberTest() throws Exception{
    	System.out.println("테스트 : DAO 객체 호출");
    	
    	MemberVO delvo = new MemberVO();
    	delvo.setUserid("user02");
    	delvo.setUserpw("1234");
    	
    	mdao.deleteMember(delvo);
    	
    	System.out.println(" test : 삭제 완료 ");
    }
    
    
    @Test
    public void memberListTest() throws Exception{

    	System.out.println(mdao.getMemberList());
    }
    
}
