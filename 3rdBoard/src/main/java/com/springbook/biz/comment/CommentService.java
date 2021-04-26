package com.springbook.biz.comment;

public interface CommentService {

	void insertComment(CommentVO vo);

	void updateComment(CommentVO vo);

	void deleteComment(CommentVO vo);
	
	CommentVO getComment(CommentVO vo);
	
	CommentPages getCommentPages(int pageNo);
}
