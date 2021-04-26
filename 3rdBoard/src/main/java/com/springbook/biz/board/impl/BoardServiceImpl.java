package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardPages;
import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.MoodVO;
import com.springbook.biz.board.PageSize;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAOMybatis boardDAO;

	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
		boardDAO.insertMood();
	}
	
	public void goodOrBad(MoodVO vo) {
		boardDAO.goodOrBad(vo);
	}
	
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		boardDAO.increaseCount(vo);
		return boardDAO.getBoard(vo);
	}
	
	public MoodVO getMood(MoodVO mvo) {
		return boardDAO.getMood(mvo);
	}
	
	public BoardPages getBoardPages(int pageNo) {
		int totalBoardCount = boardDAO.getBoardCount();
		PageSize pageSize = new PageSize(((pageNo-1) * 10)+1, (pageNo * 10));
		List<BoardVO> boardList = boardDAO.getBoardPages(pageSize);
		return new BoardPages(totalBoardCount, pageNo, 10, boardList);
		
	}



}