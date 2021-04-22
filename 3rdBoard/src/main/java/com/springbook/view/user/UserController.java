package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
import com.springbook.biz.user.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userservice;

	@RequestMapping("/createUser.do")
	public String userCreate(UserVO vo) {
		userservice.createUser(vo);
		return "index.jsp";
	}
	
	@RequestMapping("/login.do")
	public String getUser(UserVO vo, HttpSession session) {
		
		try {
			
		UserVO user = userservice.getUser(vo);
		session.setAttribute("user", user);
		
		if(user != null) {
			return "getBoardList.do";
		}else {
		
		return "login.jsp";
		}
		}catch (Exception e) {
			return "login.jsp";
		}
	}
	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "login.jsp";
		
	}
	
	@RequestMapping("/changePassword.do")
	public String changePassword(UserVO vo){ // HttpSession객체를 매개변수로 받음
		System.out.println("비밀번호 변경 처리...");
		
		userservice.changePassword(vo);
		
		return "index.jsp";
		
	}
	
	
}
