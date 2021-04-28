package com.springbook.biz.user;



import java.sql.Date;
import java.util.Map;

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
	private String birth;
	private String post;
	private String address;
	
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + ", email=" + email +"]";
	}

	public Boolean isEmpty() {
		return this.id != null;
	}
	
	public void idAndPwIsNotNull(Map<String, Boolean> errors,UserVO vo) {
		if(vo.getId() == null || vo.getId() == "") {
			errors.put("id", Boolean.TRUE);
		}
		if(vo.getPassword() == null || vo.getPassword() == "") {
			errors.put("password", Boolean.TRUE);
		}
	}
	
	public Boolean matchPassword(UserVO vo) {
		return vo.getPassword().equals(password);
	}
	
	public Boolean isAdmin() {
		return this.role.equals("admin");
	}
	
}