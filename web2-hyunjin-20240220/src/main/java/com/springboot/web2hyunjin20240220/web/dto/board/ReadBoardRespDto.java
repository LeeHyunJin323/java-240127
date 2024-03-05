package com.springboot.web2hyunjin20240220.web.dto.board;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadBoardRespDto {

	private int boardcode;
	private String title;
	private String usercode;
	private String username;
	private String content;
	private LocalDateTime createDate;
	
	

}


