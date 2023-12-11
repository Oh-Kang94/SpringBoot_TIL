package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.ADto;
import com.springlec.base.service.ADaoService;
import com.springlec.base.service.ADaoService2;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AController2 {

	@Autowired
	ADaoService2 service;

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
