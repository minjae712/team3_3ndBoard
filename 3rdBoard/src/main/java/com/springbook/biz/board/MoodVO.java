package com.springbook.biz.board;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MoodVO {

	private int no;
	private int good;
	private int bad;
	
	public void clear() {
		no = 0;
		good = 0;
		bad = 0;
	}
}
