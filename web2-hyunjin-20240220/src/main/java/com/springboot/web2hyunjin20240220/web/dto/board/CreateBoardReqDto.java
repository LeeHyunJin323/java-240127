package com.springboot.web2hyunjin20240220.web.dto.board;

import lombok.Data;

@Data
public class CreateBoardReqDto {

	private String title;
	private int usercode;
	private String content;
	
	public void showInfo() {
		System.out.println(title);
		System.out.println(usercode);
		System.out.println(content);
		System.out.println("end");
	}
	
}
