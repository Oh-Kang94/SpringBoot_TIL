package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller

public class RequestMapping_01 {
	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOK";
		}else {
			return "redirect:studentNG";
		}
	}
	
	@RequestMapping("/studentOK")
	public String studentOK(Model model) {
		return "studnt/studentOK";
	}
	@RequestMapping("/studentNG")
	public String studentNG(Model model) {
		return "studnt/studentNG";
	}
}
