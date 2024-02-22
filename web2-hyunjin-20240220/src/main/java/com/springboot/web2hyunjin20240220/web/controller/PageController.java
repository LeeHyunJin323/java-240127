package com.springboot.web2hyunjin20240220.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@GetMapping("/index") // 요청을 보내면 여기서 받음
	public String index() { // 받으면 메소드 여기서 실행
		return "hello"; // hello 가 출력된게 아님 hello html을 들고온거
		
	}
	
	@ResponseBody // getUsername()메소드가 responseBody임 
	@GetMapping("api/v1/username")
	public String getUsername() {
		return "hyunjin";
	}
	
}
// 화면띄우는곳