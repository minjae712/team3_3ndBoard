package com.springbook.view.board;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardPages;
import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.MoodVO;
import com.springbook.biz.board.NoticeVO;
import com.springbook.biz.comment.CommentService;
import com.springbook.biz.comment.CommentVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping("/goodOrBad.do")
	public String goodOrBad(MoodVO vo) throws IOException {
		int no = vo.getNo();
		boardService.goodOrBad(vo);
		vo.clear();
		return "redirect:getBoard.do?no=" + no;
	}
	
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		boardService.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
	

	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		boardService.updateBoard(vo);
		return "redirect:getBoardList.do";
	}

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}

	@RequestMapping("/deleteNotice.do")
	public String deleteNotice(NoticeVO nvo) {
		boardService.deleteNotice(nvo);
		return "redirect:getBoardList.do";
	}

	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model,CommentVO Commentvo,MoodVO mvo) {
		BoardVO result = boardService.getBoard(vo);
		model.addAttribute("board", result);
		mvo.setNo(vo.getNo());
		MoodVO result2 = boardService.getMood(mvo);
		return "redirect:getCommentList.do?no=" + result.getNo()+"&good="+ result2.getGood() + "&bad=" + result2.getBad(); 
	}

	@RequestMapping("/getNotice.do")
	public String getNotice(NoticeVO nvo, Model model) {
		NoticeVO result = boardService.getNotice(nvo);
		model.addAttribute("nvo", result);
		return "getNotice.jsp"; 
	}


	@RequestMapping(value ="/getBoardList.do")
	public String getBoardList(@ModelAttribute("bvo")BoardVO vo,BoardPages pages,Model model) {
		
		int pageNo = 1;
		if(pages.getCurrentPage() == 0) {
			pages.setCurrentPage(pageNo);
		}
		vo.searchNullCheck(vo);
		BoardPages result = boardService.getBoardPages(pages.getCurrentPage(),vo);
		vo.setSearchKeyword(vo.getSearchKeyword());
		model.addAttribute("noticeList",boardService.getNoticeList());
		model.addAttribute("pages",result);
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value = "/insertNotice.do")
	public String insertNotice(NoticeVO vo) throws IOException {
		boardService.insertNotice(vo);
		return "redirect:getBoardList.do";
	}


}
