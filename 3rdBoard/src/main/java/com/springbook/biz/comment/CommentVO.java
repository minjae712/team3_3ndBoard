package com.springbook.biz.comment;


import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommentVO {
	
	private int commentNo;
	private int no;
	private String writer;
	private String content;
	private Date regDate;

	public String toString() {
		return "CommentVO [commentNo=" + commentNo + ", no=" + no + ", writer=" + writer + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
	
}
