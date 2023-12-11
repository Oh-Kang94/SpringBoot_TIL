package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.ADto;
import com.springlec.base.service.ADaoService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AController2 {

	@Autowired
	ADaoService service;

	// 주소록 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<ADto> listDao = service.listDao();
		model.addAttribute("list", listDao);

		return "list";
	}

	// 주소록 검색 실행
	@RequestMapping("/view")
	public String search(HttpServletRequest request, Model model) throws Exception {
		int aId = Integer.parseInt(request.getParameter("aId"));
		ADto searchDao = service.searchDao(aId);
		model.addAttribute("view", searchDao);

		return "view";
	}

	// 게시판 입력 화면
	@RequestMapping("/writeForm")
	public String writeView() throws Exception {
		return "writeForm";
	}

	// 주소록 입력 실행
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception {
		service.writeDao(request.getParameter("aName"), request.getParameter("aPhone"),
				request.getParameter("aAddress"), request.getParameter("aEmail"), request.getParameter("aRelation"));
		return "redirect:list";
	}

	// 주소록 삭제 실행
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) throws Exception {
		int aId = Integer.parseInt(request.getParameter("aId"));
		service.deleteDao(aId);
		return "redirect:list";
	}

	// 게시판 수정 실행
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) throws Exception {
		int aId = Integer.parseInt(request.getParameter("aId"));
		service.modifyDao(aId, request.getParameter("aName"), request.getParameter("aPhone"),
				request.getParameter("aAddress"), request.getParameter("aEmail"), request.getParameter("aRelation"));
		return "redirect:list";
	}
	
	//	주소록 조건 검
	@RequestMapping("/listQuery")
	public String listquery(HttpServletRequest request, Model model) throws Exception{
		List<ADto> listDao = service.listQuery(request.getParameter("query"), request.getParameter("content"));
		model.addAttribute("list",listDao);
		return "list";
	}

}
