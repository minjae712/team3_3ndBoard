package com.springbook.biz.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
}