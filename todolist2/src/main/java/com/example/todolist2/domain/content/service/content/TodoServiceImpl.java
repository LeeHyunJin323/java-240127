package com.example.todolist2.domain.content.service.content;


import org.springframework.stereotype.Service;

import com.example.todolist2.domain.content.Todo;
import com.example.todolist2.domain.content.TodoRepository;
import com.example.todolist2.web.dto.CreateTodoReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

	private final TodoRepository repository;

@Override
public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception {
	// TODO Auto-generated method stub
	Todo todoEntity = createTodoReqDto.toEntity();
	
	return repository.save(todoEntity) > 0;
}
	
}
