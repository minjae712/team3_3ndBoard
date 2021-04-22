package com.springbook.biz.user.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;


@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL 구문
	private final String USER_CREATE = "INSERT INTO USERS VALUES(?,?,?,?)";
	private final String USER_GET = "SELECT * FROM USERS WHERE ID=? AND PASSWORD=?";
	private final String UPDATE_PW = "UPDATE USERS SET PASSWORD=? WHERE ID=?";
	
	
	// 회원 가입
	public void createUser(UserVO vo) {
		jdbcTemplate.update(USER_CREATE, vo.getId(),vo.getPassword(),vo.getName(),vo.getRole());
	}

	// 로그인 기능
	public UserVO getUser(UserVO vo) {
		Object[] args={vo.getId(),vo.getPassword()};
        return jdbcTemplate.queryForObject(USER_GET, args, new UserRowMapper());
    }
	
	// 암호 변경
	public void changePassword(UserVO vo) {
		jdbcTemplate.update(UPDATE_PW, vo.getPassword(), vo.getId());
				
	}	
}