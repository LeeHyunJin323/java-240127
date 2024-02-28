package com.springboot.web2hyunjin20240220.web.controller.api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/di")
public class DiController {
	
    // new 대신 의존성 주입 
	@Autowired 
	@Qualifier("t1") // 원래는 final을 붙여줌 requ이랑
	// 근데 Auto로 자동으로 잡아주고 quali에서는 사용할걸 잡아줌
	
	private TestInterface testInterface;
	//testInterface가 두개라서  실행이 안됨 
	// 그래서 이름 달아주고 객체 하나 더 생성
	
	// 보통 testInterface 객체가 두개가 있는 경우엔 다른 로직으로 해서 
	// 속도 테스트 하는 용도에 사용됨
	@Autowired
	@Qualifier("t2") 
	private TestInterface testInterface2;
	
	
	@GetMapping("/test1")
	public ResponseEntity<?> test1(){
		testInterface.a();
		testInterface.b();
		
		testInterface2.a();
		testInterface2.b();
		return ResponseEntity.ok().body(null);
	}

}
