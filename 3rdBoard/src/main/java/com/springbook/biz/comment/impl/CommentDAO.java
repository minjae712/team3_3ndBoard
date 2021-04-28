package com.springbook.biz.comment.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.comment.CommentVO;
import com.springbook.biz.comment.PageSize;

@Repository
public class CommentDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertComment(CommentVO vo) {
		mybatis.insert("CommentDAO.insertComment", vo);
	}

	public void updateComment(CommentVO vo) {
		mybatis.update("CommentDAO.updateComment", vo);
	}

	public void deleteComment(CommentVO vo) {
		mybatis.delete("CommentDAO.deleteComment", vo);
	}

	public CommentVO getComment(CommentVO vo) {
		return (CommentVO) mybatis.selectOne("CommentDAO.getCommentd", vo);
	}
	
	public int getCommentCount(CommentVO vo) {
		return mybatis.selectOne("CommentDAO.getCommentCount",vo);
	}
	
	public List<CommentVO> getCommentList(CommentVO vo) {
		return mybatis.selectList("CommentDAO.getCommentList", vo);
	}


}