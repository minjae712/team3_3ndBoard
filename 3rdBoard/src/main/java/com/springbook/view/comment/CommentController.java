package com.springbook.view.comment;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.MoodVO;
import com.springbook.biz.comment.CommentService;
import com.springbook.biz.comment.CommentVO;

@Controller
public class CommentController {
	
	@Autowired
	private CommentService CommentService;
	
	@RequestMapping(value = "/insertComment.do")
	public String insertComment(CommentVO vo) throws IOException {
		CommentService.insertComment(vo);
		return "redirect:getBoard.do?no="+vo.getNo();
	}

	@RequestMapping("/updateComment.do")
	public String updateComment(@ModelAttribute("Comment") CommentVO vo) {
		CommentService.updateComment(vo);
		return "redirect:getBoard.do?no="+vo.getNo();
	}

	@RequestMapping("/deleteComment.do")
	public String deleteComment(CommentVO vo) {
		CommentService.deleteComment(vo);
		return "redirect:getBoard.do?no="+vo.getNo();
	}

	@RequestMapping(value ="/getCommentList.do")
	public String getCommentList(CommentVO vo,Model model,MoodVO mvo) {
		model.addAttribute("count", CommentService.getCommentCount(vo));
		model.addAttribute("commentList",CommentService.getCommentList(vo));
		model.addAttribute("mvo",mvo);
		return "getBoard.jsp";
	}


}
