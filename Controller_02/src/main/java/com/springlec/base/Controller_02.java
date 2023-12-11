package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class Controller_02 {

	@RequestMapping("/write")
	public String write(Model model) {
		model.addAttribute("age",30);
		return ("board/write");
	}
}
