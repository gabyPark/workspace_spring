package com.itwillbs.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.MemberVO;

// @Repository : 해당 파일을 DAO로 사용하겠다 => 스프링한테 전달
@Repository
public class MemberDAOImpl implements MemberDAO {

	// 디비 연결하는 객체가 필요함 -> 의존
	@Inject
	private SqlSession sqlSession;
	
	
	// 사용할 mapper의 위치
	private static final String namespace 
						= "com.itwillbs.mapper.MemberMapper";
	
	
	@Override
	public String getTime() {
		System.out.println("DAO : 디비연결 정보 : "+sqlSession);
		
		// selectOne(sql) => 결과 1개를 리턴
		System.out.println("DAO : getTime() 호출!");
		return sqlSession.selectOne(namespace+".getTime");
	}


	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("DAO : 회원가입 메서드 실행!!");
		
		sqlSession.insert(namespace+".insertMember", vo);
		
		System.out.println("DAO : 회원가입 메서드 종료!!");
	}
	
	@Override
	public MemberVO readMember(String id) throws Exception {

		System.out.println("@@@@ DAO : readMember(id) 실행");
		
		return sqlSession.selectOne(namespace+".selectMember",id);
	}


	@Override
	public MemberVO loginMember(String id, String pw) throws Exception {

		System.out.println("@@@@@ DAO : loginMember(id,pw) 실행");
		System.out.println(" SQL구문 호출-실행 ");
		
		// sql 쿼리를 실행할때는 전달인자를 1개만 사용가능
		// -> 1개 이상의 전달인자를 사용해야하는경우 Map을사용해서 저장

		Map<String, Object> paramMap 
		  = new HashMap<String, Object>();
		// 저장할때 key값은 mapper의 매핑되는 키워드와 같아야함
		paramMap.put("userid", id);
        paramMap.put("userpw", pw);		  
		
		//"com.itwillbs.mapper.MemberMapper.loginMember"
		MemberVO vo =
          sqlSession.selectOne(namespace+".loginMember", paramMap);
		
		return vo;
	}


	@Override
	public void updateMember(MemberVO vo) throws Exception {
		System.out.println("DAO : updateMember(vo)");
		sqlSession.update(namespace+".updateMember",vo);
		
		System.out.println("DAO : 정보 수정 완료!!!");
	}


	@Override
	public void deleteMember(MemberVO vo) throws Exception {
		System.out.println("DAO : deleteMember(vo) 실행 ");
		System.out.println("DAO : mybatis 사용 mapper 호출");
		
		sqlSession.delete(namespace+".delMember",vo);
		
		System.out.println("DAO : 실행 완료!");
	}


	@Override
	public List<MemberVO> getMemberList() throws Exception {
        System.out.println("DAO : 회원 리스트 조회");
		
        // sqlSession.selectList() 
        // => mapper의 결과를 리스트의 형태로 생성하는 메서드
		return sqlSession.selectList(namespace+".getMemberList");
	
	}
}
