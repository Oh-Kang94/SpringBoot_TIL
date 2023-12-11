package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_01 {
	@RequestMapping("/")
	public String view() {
		
		return "view";
	}
	@RequestMapping("/board/view")
	public String boardView() {
		
		return "/board/view";
	}
	
	@RequestMapping("/board/content")
	public String baordContent(Model model) {
		model.addAttribute("id","kim");
		model.addAttribute("age","30");
		
		return "/board/view";
	}
	
	@RequestMapping("/board/reply")
	public ModelAndView boardReply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "Lee");
		mv.addObject("age", "20");
		mv.setViewName("/board/reply");
		return mv;
	}
	
}
