package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDAO userDAO;
	
	public void createUser(UserVO vo) {
		userDAO.createUser(vo);
	}
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	public void changePassword(UserVO vo) {
		userDAO.changePassword(vo);
	}	
}
