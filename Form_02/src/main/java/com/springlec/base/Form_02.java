package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Form_02 {
	@RequestMapping("/{studentId}")
	public String getStudnet(@PathVariable String studentId, Model model) {
		model.addAttribute("studentId",studentId);
		return "student/studentView";
	}
	
}
