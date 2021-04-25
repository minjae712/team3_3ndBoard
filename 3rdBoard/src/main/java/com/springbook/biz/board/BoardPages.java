package com.springbook.biz.board;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardPages {
	
	private int totalBoard;							
	private int currentPage;					
	private List<BoardVO> boardList;
	
	private int totalPages;
	private int startPage;
	private int endPage;
	
	public BoardPages() {
		currentPage = 0;
	}
	
	public BoardPages(int totalBoard, int currentPage,int sizePerPage, List<BoardVO> boardList) {
		this.totalBoard = totalBoard;
		this.currentPage = currentPage;
		this.boardList = boardList;
		
		if(totalBoard == 0) {
			totalPages = 0;
			startPage = 0;
			endPage = 0;
		
		}else {
			
			totalPages = totalBoard/sizePerPage;
			if(totalBoard % sizePerPage > 0) {
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
		return totalBoard == 0;
	}
	
	public boolean hasArticles() {
		return totalBoard > 0;
	}

	
}
