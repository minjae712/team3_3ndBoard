package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service
public class UserServiceImpl implements UserService {

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

	public UserVO find_id(UserVO vo) {
		System.out.println("아이디 찾아여");
		return userDAO.find_id(vo);
	}

	public UserVO findPassword(UserVO vo) {
		System.out.println("암호를 찾아여");
		return userDAO.findPassword(vo);
	}
}
