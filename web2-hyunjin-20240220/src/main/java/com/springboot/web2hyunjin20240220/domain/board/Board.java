package com.springboot.web2hyunjin20240220.domain.board;

import java.time.LocalDateTime;
import java.util.List;

import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.web2hyunjin20240220.web.dto.board.ReadBoardRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Board {
	private int boardcode;
	private String title;
	private int usercode;
	
	private String username;
	
	
	
	private String content;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	
	
	public CreateBoardRespDto toCreateBoardDto(boolean insertStatus) {
		return CreateBoardRespDto.builder()
				.boardcode(boardcode)
				.title(title)
				.usercode(usercode)
				.content(content)
				.insertStatus(insertStatus)
				.build();
		
	

	}
	
   public ReadBoardRespDto toReadBoardDto() {
	   return ReadBoardRespDto.builder()
			   .boardcode(boardcode)
			   .content(content)
			   .title(title)
			   .username(username)
			   .createDate(createdate)
			   .build();
	   
   }
   

	
}
