package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardPages;
import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.MoodVO;
import com.springbook.biz.board.NoticeVO;
import com.springbook.biz.board.PageSize;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAOMybatis boardDAO;

	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
		boardDAO.insertMood();
	}

	public void insertNotice(NoticeVO nvo) {
		boardDAO.insertNotice(nvo);
		
	}
	
	public void goodOrBad(MoodVO vo) {
		boardDAO.goodOrBad(vo);
	}
	
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteMood(vo);
		boardDAO.deleteBoard(vo);
	}

	public void deleteNotice(NoticeVO nvo) {
		boardDAO.deleteNotice(nvo);
	}

	public BoardVO getBoard(BoardVO vo) {
		boardDAO.increaseCount(vo);
		return boardDAO.getBoard(vo);
	}
	public NoticeVO getNotice(NoticeVO nvo) {
		return boardDAO.getNotice(nvo);
	}
	
	public List<NoticeVO> getNoticeList() {
		return boardDAO.getNoticeList();
	}

	public MoodVO getMood(MoodVO mvo) {
		return boardDAO.getMood(mvo);
	}
	
	public BoardPages getBoardPages(int pageNo,BoardVO vo) {
		int totalBoardCount = boardDAO.getBoardCount();
		vo.setStartRow(((pageNo-1) * 10)+1);
		vo.setEndRow((pageNo * 10));
		List<BoardVO> boardList = boardDAO.getBoardPages(vo);
		return new BoardPages(totalBoardCount, pageNo, 10, boardList);
		
	}






}