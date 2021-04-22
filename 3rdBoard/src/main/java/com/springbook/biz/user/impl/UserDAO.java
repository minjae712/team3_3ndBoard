package com.springbook.biz.user.impl;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository
public class UserDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 회원 가입
	public void createUser(UserVO vo) {
		mybatis.insert("userDAO.createUser", vo);
	}

	// 로그인 기능
	public UserVO getUser(UserVO vo) {
		return (UserVO)mybatis.selectOne("userDAO.getUser", vo);
	}
	
	// 암호 변경
	public void changePassword(UserVO vo) {
		mybatis.update("userDAO.changePassword",vo);
				
	}	
}