package com.springboot.web2hyunjin20240220.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2hyunjin20240220.web.dto.TestRespDto;

@RestController  // controller + responsebody
@RequestMapping("/api/v1") // 요청을 api v1을 무조건 앞에 붙여라
public class ApiTestController {
//
//	   @GetMapping("/test")
//	   public String getTest() {
//	      return "test data";
//	   }
//	
//	@GetMapping("/userTest")
//	public TestRespDto getUserTest(){
//		return  TestRespDto.builder()
//				.username("gildong")
//				.password("1234")
//				.build();
	
	   //post는 값을 읽음(?)
	   // url에서 엔터치면 겟메핑
		@PostMapping("/userTest")
		public TestRespDto getUserTest(){
			return  TestRespDto.builder()
					.username("gildong")
					.password("1234")
					.build();
			
		/*	 @RequestParam -> 파람으로 값을 보낼때 매개변수에서 받는 용도
			 @RequestParam("name") -> 키값("name")을 잡아줘야함
			 String name에서  name에 벨류 값이 들어옴(자료형은 @RequestParam이 잡아줌)
			 @RequestParam,소괄호의 안의 키값 생략 가능
			 
			 *
			 */
//			
//		    @GetMapping("/userLogin")
//		    public String getUserLogin(@RequestParam("name") String name, @RequestParam("password") int password) {
//		        return name + password;
			
		

			
//			@GetMapping("/userLogin")
//			public String getUserLogin(@RequestParam("name") String name, @RequestParam("password") int password) {
//				return name+password;
//			}
		
		
	}
		@GetMapping("/userLogin")
		public String getUserLogin(String name, int password)
		{
			return name + password;
		}
		/*
		 * api/v1/userTest 겟 요청을 보냄
		 * 메소드명 getUserTest
		 * 리턴 gildong/1234 인 객체 리턴
		 */
	}
	

