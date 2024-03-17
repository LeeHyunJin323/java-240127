package com.study.security20240312hyunjin.service.auth;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.study.security20240312hyunjin.domain.user.User;

import lombok.Data;

@Data
public class PrincipalDetails implements UserDetails {

	private static final long serialVersionUID = -7143979541693209206L;

	private User user;

	
	public PrincipalDetails(User user) {
		this.user = user;
		// 생성될때 user의 객체를 받음
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() { // 권한에 관한 매소드

		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
//		List<String> roleList = user.getUserRoles();
//		
//		for(String role : roleList) {
//			GrantedAuthority authority = new GrantedAuthority() {
//				//GrantedAuthority 객체 생성 -> 안에 익명클래스가 나옴
//				// 권한에 대해서 role 값 하나하나 리턴
//				// 그냥 하나씩 건내주면 얘가 알아서 권한 처리 하는듯
//				
//				@Override
//				public String getAuthority() {
//					
//					return role;
//				}
//			};
//		    grantedAuthorities.add(authority);
//			
//			}
		user.getUserRoles().forEach(role -> {
			grantedAuthorities.add(()-> role);
		});
		
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {

		return user.getUser_password();
	}

	@Override
	public String getUsername() {

		return user.getUser_id();
	}

	@Override
	public boolean isAccountNonExpired() {
		// 계정 만료 여부
		// true : 만료 안됨 , false: 만료됨
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
		// 계정 잠김 여부
		// true : 잠기지 않음, false: 잠김
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
		// 비밀번호 만료 여부
		// true: 만료 안됨 , false : 만료됨

	}

	@Override
	public boolean isEnabled() {
		return true;
		// 사용자 활성화 여부
		// true : 활성화 , false : 비활성화
	}

}
