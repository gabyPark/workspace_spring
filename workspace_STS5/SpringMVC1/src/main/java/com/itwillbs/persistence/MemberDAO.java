package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.MemberVO;

public interface MemberDAO {

	// 디비에서 실행해야 하는 동작을 미리 선언
	
	// 디비 연결 테스트 - 디비 시간 정보 가져오기
	public String getTime();
	
	
	// 회원가입 동작
	public void insertMember(MemberVO vo);
	
	// 아이디에 해당하는 회원정보 조회
	public MemberVO readMember(String id) throws Exception;
	
	
	// 아이디, 비밀번호를 사용해서 회원정보 조회 (로그인)
	public MemberVO loginMember(String id, String pw) throws Exception;
	
	// 아이디 비밀번호를 사용해서 회원정보(이름)을 수정
	public void updateMember(MemberVO vo) throws Exception;
		
	// 아이디 비밀번호를 사용해서 회원정보 삭제
	public void deleteMember(MemberVO vo) throws Exception;
	
	// 회원 전체 목록을 가져오는 기능
	public List<MemberVO> getMemberList() throws Exception;
}
