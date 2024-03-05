package com.example.todolist.domain.content.service.content;

import java.util.List;

import com.example.todolist.web.dto.CreateTodoReqDto;
import com.example.todolist.web.dto.TodoListRespDto;

public interface TodoService {

	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception;
	public List<TodoListRespDto> getTodoList(int page) throws Exception;
	
}




