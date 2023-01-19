package com.cos.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BoardController {
	@GetMapping("/")
	public String idnex() {
		//WEB-INF/views/index.jsp
		return "index";
	}
}
