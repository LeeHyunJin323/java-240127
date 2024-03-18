package com.study.security20240312hyunjin.service.auth;

import com.study.security20240312hyunjin.web.dto.UsernameCheckReqDto;

public interface AuthService {

	// 아이디 중복 확인
	public boolean checkUsername(UsernameCheckReqDto usernameCheckReqDto) throws Exception;
	// 로그인
	public boolean signup() throws Exception;
	
}
