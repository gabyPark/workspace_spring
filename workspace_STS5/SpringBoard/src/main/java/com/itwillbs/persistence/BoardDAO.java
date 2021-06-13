package com.itwillbs.persistence;

import com.itwillbs.domain.BoardVO;

public interface BoardDAO {

	// 글쓰기 동작 (Create)
	public void create(BoardVO vo) throws Exception;
	
}
