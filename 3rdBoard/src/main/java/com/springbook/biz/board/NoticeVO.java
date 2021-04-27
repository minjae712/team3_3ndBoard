package com.springbook.biz.board;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NoticeVO {

	private int uni;
	private String no;
	private String writer;
	private String title;
	private String content;
	private Date regDate;
	private int cnt;
	
	@Override
	public String toString() {
		return "NoticeVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}

	
}