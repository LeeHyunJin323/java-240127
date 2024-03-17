package com.study.security20240312hyunjin.web.controller.api;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.security20240312hyunjin.service.auth.PrincipalDetailsService;
import com.study.security20240312hyunjin.web.dto.CMRespDto;
import com.study.security20240312hyunjin.web.dto.UsernameCheckReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
	private final PrincipalDetailsService principalDetailsService;
	
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(){
		return ResponseEntity.ok().body(principalDetailsService.addUser());
	}
	
	@GetMapping("/signup/validation/username") // vaild -> 유효성 검
	public ResponseEntity<?> checkUsername(@Valid @RequestBody UsernameCheckReqDto usernameCheckReqDto, BindingResult bindingResult){
		Map<String ,String> errorMessage = new HashMap<String , String>();
		
		// 컨트롤러에서 왜 로직을 짰는가?
		
		if(bindingResult.hasErrors()) {
			bindingResult.getFieldErrors().forEach(error -> {
				System.out.println("오류발생 필드명 : " + error.getField());
				System.out.println("오류발생 상태메세지 :" + error.getDefaultMessage());
			
			errorMessage.put(error.getField(), error.getDefaultMessage());
			
			});
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"유효성 검사 실패",errorMessage));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"유효성 검사 성공",true));
	}

}
