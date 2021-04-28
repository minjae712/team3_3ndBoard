package com.springbook.biz.comment;

import java.util.List;

public interface CommentService {

	void insertComment(CommentVO vo);

	void updateComment(CommentVO vo);

	void deleteComment(CommentVO vo);
	
	int getCommentCount(CommentVO vo);
	
	List<CommentVO> getCommentList(CommentVO vo);
}
