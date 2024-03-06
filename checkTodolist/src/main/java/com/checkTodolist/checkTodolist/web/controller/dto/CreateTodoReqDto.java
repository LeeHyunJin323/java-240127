package com.checkTodolist.checkTodolist.web.controller.dto;

import com.checkTodolist.checkTodolist.domain.todo.Todo;

import lombok.Data;

@Data
public class CreateTodoReqDto {

	
	private boolean importance; // importance 를 1을 받으면 true ,0 받으면 false
	private String todo;
	
	
	public Todo toEntity() {
		return Todo.builder()
		.importance_flag(importance ? 1:0)
		.todo_content(todo)
		.build();
	}
}
