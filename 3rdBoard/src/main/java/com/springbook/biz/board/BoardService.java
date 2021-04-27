package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	void insertBoard(BoardVO vo);
	
	void goodOrBad(MoodVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);
	
	MoodVO getMood(MoodVO mvo);
	
	BoardPages getBoardPages(int pageNo,BoardVO vo);
}
