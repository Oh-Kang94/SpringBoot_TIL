package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.Dto;
import com.springlec.base.service.DaoService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	DaoService service;

	// 주소록 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<Dto> listDao = service.listDao();
		model.addAttribute("list", listDao);

		return "list";
	}


}
