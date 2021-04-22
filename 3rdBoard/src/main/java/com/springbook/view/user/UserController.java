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
		userservice.createUser(vo);
		return "index.jsp";
	}
	
	@RequestMapping("/login.do")
	public String getUser(UserVO vo, HttpSession session) {
		
		
		UserVO user = userservice.getUser(vo);
		session.setAttribute("user", user);
		
		if(user != null) {
			return "getBoardList.do";
		}else {
			return "login.jsp";
		}
		
		}
	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "login.jsp";
		
	}
	
	@RequestMapping("/changePassword.do")
	public String changePassword(UserVO vo){ // HttpSession��ü�� �Ű������� ����
		System.out.println("��й�ȣ ���� ó��...");
		userservice.changePassword(vo);
		return "index.jsp";
		
	}
	
	
}
