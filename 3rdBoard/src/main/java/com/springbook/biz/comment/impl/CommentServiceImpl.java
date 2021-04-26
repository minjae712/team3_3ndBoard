package com.springbook.biz.comment.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.comment.CommentPages;
import com.springbook.biz.comment.CommentService;
import com.springbook.biz.comment.CommentVO;
import com.springbook.biz.comment.PageSize;

@Service("CommentService")
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentDAO CommentDAO;
	
	public void insertComment(CommentVO vo) {
		CommentDAO.insertComment(vo);
	}

	public void updateComment(CommentVO vo) {
		CommentDAO.updateComment(vo);
	}

	public void deleteComment(CommentVO vo) {
		CommentDAO.deleteComment(vo);
	}

	public CommentVO getComment(CommentVO vo) {
		return CommentDAO.getComment(vo);
	}

	public CommentPages getCommentPages(int pageNo) {
		int totalBoardCount = CommentDAO.getCommentCount();
		PageSize pageSize = new PageSize(((pageNo-1) * 10)+1, (pageNo * 10));
		List<CommentVO> CommentList = CommentDAO.getCommentPages(pageSize);
		return new CommentPages(totalBoardCount, pageNo, 10, CommentList);
		
	}
	
}
