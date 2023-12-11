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
public class Bcontroller {

	@Autowired
	BDaoService service;

	// 게시판 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<BDto> listDao = service.listDao();
		model.addAttribute("list", listDao);

		return "list";
	}

	// 입력 화면 가기
	@RequestMapping("/writeForm")
	public String writeForm() throws Exception {
		return "writeForm";
	}

	// 입력하기
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception {
		service.writeDao(request.getParameter("bName"), request.getParameter("bContent"));
		return "redirect:list";
	}
	
	// 게시판 삭제 실행
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) throws Exception {
		int bId = Integer.parseInt(request.getParameter("bId"));
		service.deleteDao(bId);
		return "redirect:list";
	}
}
