package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping ("/board")
public class Controller_01 {
	@RequestMapping("/confirmId")
	public String confirmId(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return ("board/confirmId");
	}
	@RequestMapping("/checkId")
	public String checkId(@RequestParam("id")String id, @RequestParam("pw") int pw, Model model) {
		model.addAttribute("idindentify",id);
		model.addAttribute("password", pw);
		
		return ("board/checkId");
	}
}
