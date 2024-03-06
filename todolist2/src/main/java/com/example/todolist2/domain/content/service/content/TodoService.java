package com.example.todolist2.domain.content.service.content;

import com.example.todolist2.web.dto.CreateTodoReqDto;

public interface TodoService {

	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception;
	
}
