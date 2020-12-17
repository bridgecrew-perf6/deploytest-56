package com.marybeth.TechTalentBlog;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
	@GetMapping("/")
	public String main() {
		System.out.println("Hello World");
		return "index";
	}
}
