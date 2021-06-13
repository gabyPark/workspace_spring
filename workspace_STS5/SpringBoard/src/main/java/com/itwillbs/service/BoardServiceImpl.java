package com.itwillbs.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {


	// DAO 객체 필요 -> 주입
	@Inject
	private BoardDAO bdao;
	// 인터페이스를 찾아 root-context 로 가면, repository 를 찾아서 어쩌고..
	
	
	@Override
	public void regist(BoardVO vo) throws Exception {
		System.out.print("서비스 실행");
		bdao.create(vo);
		System.out.print("서비스 종료");
		
	}
}
