package com.springbook.biz.board;

import java.util.List;

public interface BoardService {

	void insertBoard(BoardVO vo);
	
	void insertNotice(NoticeVO nvo);
	
	void goodOrBad(MoodVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);
	
	void deleteNotice(NoticeVO nvo);

	BoardVO getBoard(BoardVO vo);
	
	NoticeVO getNotice(NoticeVO nvo);
	
	List<NoticeVO> getNoticeList();
	
	MoodVO getMood(MoodVO mvo);
	
	BoardPages getBoardPages(int pageNo,BoardVO vo);
}
