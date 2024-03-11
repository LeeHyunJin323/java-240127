package com.practice.pracetice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	
	@GetMapping("/index")
	public String main() {
		return "main";
	}
	
	@GetMapping("/data")
	@ResponseBody
	public String main2() {
		return "hi";
	}
}
