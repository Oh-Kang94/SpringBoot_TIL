package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BController {

	@Autowired
	BDaoService service;

	// 게시판 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<BDto> listDao = service.listDao();
		model.addAttribute("list", listDao);

		return "list";
	}

	// 게시판 입력 화면
	@RequestMapping("/write_view")
	public String writeView() throws Exception {
		return "write_view";
	}

	// 게시판 입력 실행
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception {
		service.writeDao(request.getParameter("bName"), request.getParameter("bTitle"),
				request.getParameter("bContent"));
		return "redirect:list";
	}

	// 게시판 검색 실행
	@RequestMapping("/content_view")
	public String search(HttpServletRequest request, Model model) throws Exception {
		int bId = Integer.parseInt(request.getParameter("bId"));
		System.out.println("bId" + bId);
		BDto searchDao = service.searchDao(bId);
		model.addAttribute("content_view", searchDao);

		return "content_view";
	}

	// 게시판 삭제 실행
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) throws Exception {
		int bId = Integer.parseInt(request.getParameter("bId"));
		service.deleteDao(bId);
		return "redirect:list";
	}

	// 게시판 수정 실
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) throws Exception {
		int bId = Integer.parseInt(request.getParameter("bId"));
		service.modifyDao(bId, request.getParameter("bName"), request.getParameter("bTitle"),
				request.getParameter("bContent"));
		return "redirect:list";
	}
}
