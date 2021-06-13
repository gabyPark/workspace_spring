package com.itwillbs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	// sqlSession 객체를 주입
	@Inject
	private SqlSession sqlsession;
	
	
	private static final String namespace=
			"com.itwillbs.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		// mapper 호출객체 필요
		
		System.out.println(" DAO : 글쓰기 실행! ");
		sqlsession.insert(namespace+".createboard",vo);	
		
	}

}
