package com.springbook.biz.user;



import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserVO {
	private String id;
	private String role;
	private String password;
	private String email;
	private String image;
	private String name;
	private Date birth;
	private String post;
	private String address;
	
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
}