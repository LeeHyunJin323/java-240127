package com.study.security20240312hyunjin.domain.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	private int user_code;
	private String user_name;
	private String user_email;
	private String user_id;
	private String user_password;
	private String user_roles;
	private String user_provider;
	private String user_profile_img;
	private String user_address;
	private int user_gender;
	
	public List<String> getUserRoles(){
		if(user_roles == null || user_roles.isBlank()) {
			return new ArrayList<String>(); // 빈거에 리스트로 리턴
		}
		return Arrays.asList(user_roles.replaceAll(" " , "").split(",")); // 뭐가 담겨 있으면 빈칸을 없애고 ,를 기준으로 배열 잡아줌
		// 배열을 리스트로 바꿔줌
	}
	
}
