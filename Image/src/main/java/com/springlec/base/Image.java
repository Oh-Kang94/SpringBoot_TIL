package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Image {

	@RequestMapping("/")
	public String hello() {
		System.out.println("hello world!");
		return "index";
	}
}
