package com.example.todolist2.web.dto;


import com.example.todolist2.domain.content.Todo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateTodoReqDto {
    private String content;
    private int usercode;


   public Todo toEntity() {
	   return Todo.builder()
			   .content(content)
			   .user_code(usercode)
			   .build();
	   
	   
   }
}
