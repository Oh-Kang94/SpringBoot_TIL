package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Controller_031 {
	@RequestMapping("/view")
	public String view() {
		return "test/view";
	}
}
