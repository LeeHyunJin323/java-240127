package com.checkTodolist.checkTodolist.service.todo;



import java.util.List;

import com.checkTodolist.checkTodolist.web.controller.dto.CreateTodoReqDto;
import com.checkTodolist.checkTodolist.web.controller.dto.TodoListRespDto;
;

public interface TodoService {

	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception;
	
	
	public List<TodoListRespDto> getToList(int page, int contentCount )throws Exception;
	
}
