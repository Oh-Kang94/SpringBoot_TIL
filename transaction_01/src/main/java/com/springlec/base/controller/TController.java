package com.springlec.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.TDaoService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TController {

	@Autowired
	TDaoService service;

	// 입력 화면
	@RequestMapping("/")
	public String insert() throws Exception {
		return "input";
	}

	// 입력 실행
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception {
		service.writeDao(request.getParameter("id"), request.getParameter("product"));
		return "complete";
	}
}
