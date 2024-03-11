package com.practice.pracetice.web.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PracticeRespDto {

		
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private int userId;
	private String userUsername;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	

	
}
