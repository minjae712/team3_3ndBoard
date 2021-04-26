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

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("내용", "CONTENT");
		conditionMap.put("제목", "TITLE");
		return conditionMap;
	}
	
	
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

	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		BoardVO result = boardService.getBoard(vo);
		model.addAttribute("board", result); 
		return "redirect:getMood.do?no="+ result.getNo(); 
	}

	@RequestMapping("/getMood.do")
	public String getMood(MoodVO mvo, Model model) {
		model.addAttribute("mvo", boardService.getMood(mvo)); 
		return "getBoard.jsp"; 
	}

	@RequestMapping(value ="/getBoardList.do")
	public String getBoardList(BoardVO vo,BoardPages pages,Model model) {
		
		int pageNo = 1;
		if(pages.getCurrentPage() == 0) {
			pages.setCurrentPage(pageNo);
		}
		model.addAttribute("pages",boardService.getBoardPages(pages.getCurrentPage()));
		return "getBoardList.jsp";
	}


}
