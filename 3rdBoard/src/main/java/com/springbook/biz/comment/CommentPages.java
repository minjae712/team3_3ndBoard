package com.springbook.biz.comment;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommentPages {
	
	private int totalComment;							
	private int currentPage;					
	private List<CommentVO> commentList;
	
	private int totalPages;
	private int startPage;
	private int endPage;
	
	public CommentPages() {
		currentPage = 0;
	}
	
	public CommentPages(int totalComment, int currentPage,int sizePerPage, List<CommentVO> CommentList) {
		this.totalComment = totalComment;
		this.currentPage = currentPage;
		this.commentList = CommentList;
		
		if(totalComment == 0) {
			totalPages = 0;
			startPage = 0;
			endPage = 0;
		
		}else {
			
			totalPages = totalComment/sizePerPage;
			if(totalComment % sizePerPage > 0) {
				totalPages++;
			}
			
			int modVal = currentPage % 5;
			startPage = currentPage / 5 * 5 + 1;
			if(modVal ==0) {
				startPage -= 5;
			}
			
			endPage = startPage + 4;
			if(endPage > totalPages) {
				endPage = totalPages;
			}
		}
	}

	public boolean hasNoArticles() {
		return totalComment == 0;
	}
	
	public boolean hasArticles() {
		return totalComment > 0;
	}

	
}
