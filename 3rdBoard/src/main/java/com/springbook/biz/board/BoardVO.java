package com.springbook.biz.board;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardVO {

	private int no;
	private String writer;
	private String title;
	private String content;
	private Date regDate;
	private int cnt;
	private String searchCondition;
	private String searchKeyword;
	private int startRow;
	private int endRow;

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}

	public Boolean isEmpty() {
		return (this.searchKeyword != null) || (!this.searchKeyword.equals(""));
	}
	
	public void searchNullCheck(BoardVO vo) {
		if(vo.getSearchCondition() == null || vo.getSearchCondition().equals("")) {
			vo.setSearchCondition("TITLE");
		}
		if(vo.getSearchKeyword() == null || vo.getSearchKeyword().equals("")) {
			vo.setSearchKeyword("");
		}
	}
		
}