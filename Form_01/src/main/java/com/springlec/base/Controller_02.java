package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/member")
public class Controller_02 {
//	@RequestMapping("/join")
//	public String join(@RequestParam("name")String name, 
//					@RequestParam("id")String id, 
//					@RequestParam("pw")String pw, 
//					@RequestParam("email") String email, 
//					Model model) {
//		Member member = new Member();
//		member.setName(name);
//		member.setId(id);
//		member.setPw(pw);
//		member.setemail(email);
//		
//		model.addAttribute("member", member);
//		
//		return ("member/join");
//	}
	
	@RequestMapping("/join")
	public String join(Member member) {
		return ("member/join");
	}
}
