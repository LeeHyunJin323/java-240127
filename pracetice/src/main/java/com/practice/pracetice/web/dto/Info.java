package com.practice.pracetice.web.dto;

import lombok.Data;

@Data
public class Info {

	private String name;
	private int age;
	private String address;
	private String email;
	private String password;
	


	
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(email);
		System.out.println(password);
	}
	
	

}
