package com.springlec.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.CalcService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Acontroller {
	
	@Autowired
	CalcService service;
	
	// 계산 입력화면
	@RequestMapping("/")
	public String input() throws Exception{
		System.out.println(">>>input()<<<");
		return "input";
	}
	
	// 계산 결과화면
	@RequestMapping("/addCalc")
	public String calc(HttpServletRequest request, Model model) throws Exception{
		int num1 = Integer.parseInt(request.getParameter("num1")) ;
		int num2 = Integer.parseInt(request.getParameter("num2")) ;
		
		// 계산
		int addition = service.addAction(num1, num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("addition", addition);
		
		System.out.println(">>>calc()<<<");
		return "calcResult";
	}
	
}
