package com.springbook.view.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	Map<String, Boolean> errors = new HashMap<String, Boolean>();

	@RequestMapping("/createUser.do")
	public String userCreate(UserVO vo) {
		if (vo.getId() == null || vo.getId() == "") {
			return "createUser.jsp";
		}
		userservice.createUser(vo);
		return "createUserSuccess.jsp";
	}

	@RequestMapping("/login.do")
	public String getUser(UserVO vo, HttpSession session) {

		vo.idAndPwIsNotNull(errors, vo);
		if (!errors.isEmpty()) {
			System.out.println("로그인 실패 : 아이디나 비밀번호가 비었습니다.");
			vo = null;
			errors.clear();
			return "login.jsp";
		}

		UserVO user = userservice.getUser(vo);
		session.setAttribute("user", user);

		if (user != null && vo.matchPassword(user)) {
			System.out.println("로그인 성공");
			errors.clear();
			vo = null;
			return "redirect:getBoardList.do";
		} else {
			System.out.println("로그인 실패 : 아이디가 없거나 비밀번호가 틀립니다.");
			vo = null;
			return "login.jsp";
		}
	}

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {

		session.invalidate();
		return "index.jsp";

	}

	@RequestMapping("/changePassword.do")
	public String changePassword(UserVO vo) {
		System.out.println("비밀번호 처리");
		userservice.changePassword(vo);
		return "index.jsp";

	}

	@RequestMapping("/find_id.do")
	public String find_id(UserVO vo, Model model) {
		System.out.println("아이디 찾는중");

		UserVO find_id = userservice.find_id(vo);

		if (find_id == null) {
			model.addAttribute("check", 1);
		} else {
			model.addAttribute("check", 0);
			model.addAttribute("find_id", find_id.getId());
		}

		return "find_id.jsp";
	}

	@RequestMapping("/findPassword.do")
	public String findPassword(UserVO vo, Model model) {
			UserVO find_pw = userservice.findPassword(vo);
			if(vo.getEmail().equals(find_pw.getEmail()) && vo.getId().equals(find_pw.getId())) {
				model.addAttribute("find",find_pw);
				return "findSuccess.jsp";
			}else {
				errors.put("email", Boolean.TRUE);
				model.addAttribute("error",errors);
				return "findPassword.jsp";
			}
		
	}	
	
}


