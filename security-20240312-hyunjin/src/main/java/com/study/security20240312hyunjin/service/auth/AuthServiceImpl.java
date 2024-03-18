package com.study.security20240312hyunjin.service.auth;

import org.springframework.stereotype.Service;

import com.study.security20240312hyunjin.domain.user.UserRepository;
import com.study.security20240312hyunjin.web.dto.UsernameCheckReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

	
	private final UserRepository userRepository;
	
	@Override // 아이디 중복 확인
	public boolean checkUsername(UsernameCheckReqDto usernameCheckReqDto) throws Exception {
		return userRepository.findUserByUsername(usernameCheckReqDto.getUsername()) == null;
		// username이 있는지 없는지 확인
		// getUsername은 아이디 반환 
		
	}
	
	
	@Override // 로그인
	public boolean signup() throws Exception {
		return false;
	}
	
}
