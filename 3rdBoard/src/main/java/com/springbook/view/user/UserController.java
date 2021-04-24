package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;

	@RequestMapping("/createUser.do")
	public String userCreate(UserVO vo) {
		if(vo.getId() == null || vo.getId() == "") {
			return "createUser.jsp";
		}
		System.out.println("회원가입 처리");
		userservice.createUser(vo);
		return "index.jsp";
	}
	
	@RequestMapping("/login.do")
	public String getUser(UserVO vo, HttpSession session) {
		
		UserVO user = userservice.getUser(vo);
		session.setAttribute("user", user);
		
		if(user != null) {
			System.out.println("로그인 처리");
			return "redirect:getBoardList.do";
		}else {
			return "login.jsp";
		}
		
	}
	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");
		session.invalidate();
		return "login.jsp";
		
	}
	
	@RequestMapping("/changePassword.do")
	public String changePassword(UserVO vo){ 
		System.out.println("비밀번호 처리");
		userservice.changePassword(vo);
		return "index.jsp";
		
	}
	
	
}
