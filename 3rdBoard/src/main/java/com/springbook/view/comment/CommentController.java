package com.springbook.view.comment;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.comment.CommentPages;
import com.springbook.biz.comment.CommentService;
import com.springbook.biz.comment.CommentVO;

@Controller
@SessionAttributes("Comment")
public class CommentController {
	
	@Autowired
	private CommentService CommentService;
	
	@RequestMapping(value = "/insertComment.do")
	public String insertComment(CommentVO vo) throws IOException {
		CommentService.insertComment(vo);
		return "redirect:getBoardList.do";
	}

	@RequestMapping("/updateComment.do")
	public String updateBoard(@ModelAttribute("Comment") CommentVO vo) {
		CommentService.updateComment(vo);
		return "redirect:getBoardList.do";
	}

	@RequestMapping("/deleteComment.do")
	public String deleteBoard(CommentVO vo) {
		CommentService.deleteComment(vo);
		return "redirect:getBoardList.do";
	}

	@RequestMapping("/getComment.do")
	public String getBoard(CommentVO vo, Model model) {
		model.addAttribute("board", CommentService.getComment(vo)); 
		return "getBoard.jsp"; 
	}

	@RequestMapping(value ="/getCommentList.do")
	public String getBoardList(CommentVO vo,CommentPages pages,Model model) {
		
		int pageNo = 1;
		if(pages.getCurrentPage() == 0) {
			pages.setCurrentPage(pageNo);
		}
		model.addAttribute("pages",CommentService.getCommentPages(pages.getCurrentPage()));
		return "getBoardList.jsp";
	}


}
