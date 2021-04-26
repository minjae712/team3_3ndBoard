package com.springbook.biz.comment;


import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommentVO {
	
	private int commentNo;
	private int no;
	private String writer;
	private String role;
	private String content;
	private Date regdate;
	
	@Override
	public String toString() {
		return "CommentVO [commentNo=" + commentNo + ", no=" + no + ", writer=" + writer + ", role=" + role
				+ ", content=" + content + ", regdate=" + regdate + "]";
	}
	
}
