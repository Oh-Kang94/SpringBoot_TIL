package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class Controller_03 {
	@RequestMapping("/view")
	public String view() {
		return "board/view";
	}
}
