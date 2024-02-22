package com.springboot.web2hyunjin20240220.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestRespDto {
 // 응답하는 객체
	
	private String username;
	private String password;
	
}
