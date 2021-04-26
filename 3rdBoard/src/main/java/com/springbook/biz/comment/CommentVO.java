package com.springbook.biz.comment;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommentVO {
	
	private int no;
	private String writer;
	private String role;
	private String content;
	private Date regdate;
	
	@Override
	public String toString() {
		return "CommentVO [no=" + no + ", writer=" + writer + ", role=" + role + ", content=" + content + ", regdate="
				+ regdate + "]";
	}
}
