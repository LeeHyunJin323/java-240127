package com.practice.pracetice.web.dto;


import com.practice.pracetice.domain.practice.Practice;

import lombok.Data;


@Data
public class PracticeBoardReqDto {

	
	private String boardTitle;
	private String boardContent;
	private int userId;
	
	
	public Practice toEntity() {
		return Practice.builder()
				.board_content(boardContent)
				.board_title(boardTitle)
				.user_id(userId)
				.build();
	}
	
}
