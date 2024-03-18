package com.study.security20240312hyunjin.web.controller.api;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.CustomValidatorBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.security20240312hyunjin.handler.aop.annotation.Log;
import com.study.security20240312hyunjin.handler.aop.annotation.Timer;
import com.study.security20240312hyunjin.handler.exception.CustomValidationApiException;
import com.study.security20240312hyunjin.service.auth.AuthService;
import com.study.security20240312hyunjin.service.auth.PrincipalDetailsService;
import com.study.security20240312hyunjin.web.dto.CMRespDto;
import com.study.security20240312hyunjin.web.dto.SignupReqDto;
import com.study.security20240312hyunjin.web.dto.UsernameCheckReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
	private final PrincipalDetailsService principalDetailsService;
	private final AuthService authService;
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@Valid @RequestBody SignupReqDto signupReqDto, BindingResult bindingResult){
	
		
		// 컨트롤러에서 왜 로직을 짰는가?
		
		if(bindingResult.hasErrors()) {
			Map<String ,String> errorMessage = new HashMap<String , String>();
			bindingResult.getFieldErrors().forEach(error -> {
				System.out.println("오류발생 필드명 : " + error.getField());
				System.out.println("오류발생 상태메세지 :" + error.getDefaultMessage());
			
			errorMessage.put(error.getField(), error.getDefaultMessage());
			
			});
		// return ResponseEntity.ok().body(new CMRespDto<>(-1,"유효성 검사 실패",errorMessage));
			throw new CustomValidationApiException("유효성 검사 실패" , errorMessage);
		}
		
		
		
		boolean status = false;
		try {
			status = principalDetailsService.addUser(signupReqDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"회원가입 실패",status));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"회원가입 성공",status));
		
	}
	
	@Timer
	@Log
	@GetMapping("/signup/validation/username") // vaild -> 유효성 검사
	public ResponseEntity<?> checkUsername(@Valid @RequestBody UsernameCheckReqDto usernameCheckReqDto, BindingResult bindingResult){
		Map<String ,String> errorMessage = new HashMap<String , String>();
		
		// 컨트롤러에서 왜 로직을 짰는가?
		
		if(bindingResult.hasErrors()) {
			bindingResult.getFieldErrors().forEach(error -> {
				System.out.println("오류발생 필드명 : " + error.getField());
				System.out.println("오류발생 상태메세지 :" + error.getDefaultMessage());
			
			errorMessage.put(error.getField(), error.getDefaultMessage());
			
			});
		// return ResponseEntity.ok().body(new CMRespDto<>(-1,"유효성 검사 실패",errorMessage));
			throw new CustomValidationApiException("유효성 검사 실패" , errorMessage);
		}
		

	// return ResponseEntity.ok().body(new CMRespDto<>(1,"유효성 검사 성공",true));
	boolean status =false;
	
	try {
		status = authService.checkUsername(usernameCheckReqDto);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return ResponseEntity.ok().body(new CMRespDto<>(-1,"서버 오류", status));
	}
	return ResponseEntity.ok().body(new CMRespDto<>(1,"회원 가입 여부", status));
	// 내가 이해한 거
	// username의 값이 있는지 없는지 확인하고 usename의 중복값이 있다면 회원가입 여부 false 
	//  없다면 true가 나오면서 회원가입 가능
	// 
	}

}
