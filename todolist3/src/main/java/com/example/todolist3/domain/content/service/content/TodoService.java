package com.example.todolist3.domain.content.service.content;

import java.util.List;

import com.example.todolist3.web.dto.CreateTodoReqDto;
import com.example.todolist3.web.dto.TodoListRespDto;

public interface TodoService {

	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception;
	
	public List<TodoListRespDto> getTodoList(int page) throws Exception;
}
