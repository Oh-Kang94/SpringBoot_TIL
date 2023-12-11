package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UController {

	// 사용자 로그인 첫화면
	@RequestMapping("/")
	public String login(HttpServletRequest request) throws Exception {
		System.out.println(">>>login<<<");

		// Session 정리하고 시작하자!
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}

	// 사용자 등록 화면
	@RequestMapping("/loginCheck")
	public String regsitration(HttpServletRequest request) throws Exception {
		System.out.println(">>>> registration<<<<");

		// Session 정리하고 시작하자!
		HttpSession session = request.getSession();
		session.setAttribute("userid", request.getParameter("userid"));
		session.setAttribute("password", request.getParameter("password"));
		return "registration";
	}
}
