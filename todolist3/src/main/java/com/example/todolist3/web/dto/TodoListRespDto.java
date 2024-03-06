package com.example.todolist3.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TodoListRespDto {
// 10개씩 가져옴
	
	private int contentCode;
	private String content;
	private String userName;
	
}
