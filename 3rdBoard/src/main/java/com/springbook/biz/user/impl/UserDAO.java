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
		return (UserVO) mybatis.selectOne("userDAO.getUser", vo);
	}

	// 암호 변경
	public void changePassword(UserVO vo) {
		mybatis.update("userDAO.changePassword", vo);

	}

	// 아이디 찾기
	public UserVO find_id(UserVO vo) {
		System.out.println("아이디 찾는다");
		return mybatis.selectOne("userDAO.find_id", vo);
	}

	// 암호 찾기
	public UserVO findPassword(UserVO vo) {
		System.out.println("암호 찾는다");
		return mybatis.selectOne("userDAO.findPassword", vo);
	}
}