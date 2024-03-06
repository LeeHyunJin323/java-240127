package com.example.todolist3.domain.content.service.content;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todolist3.domain.content.Todo;
import com.example.todolist3.domain.content.TodoRepository;
import com.example.todolist3.web.dto.CreateTodoReqDto;
import com.example.todolist3.web.dto.TodoListRespDto;


import lombok.RequiredArgsConstructor;

@Service // 컨테이너에 등록 -> 계속 생성할 수 없으니 같은걸 여러번쓰기 위해서
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {


	private final TodoRepository todoRepository;
	// 서비스 임플리먼트가 생성될때 객체 얘 하나만 받음

@Override
public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception {
	// TODO Auto-generated method stub
	Todo todoEntity = createTodoReqDto.toEntity();
	
//	for(int i= 0; i < 100 ; i++)
//	{
//		todoEntity = Todo.builder()
//				.content("게시글" + (i+1))
//				.user_code(1)
//				.build();
//		
//		todoRepository.save(todoEntity);	
//	}
	
	
	return todoRepository.save(todoEntity) > 0;
	
	
	
}
@Override
public List<TodoListRespDto> getTodoList(int page) throws Exception {

List<TodoListRespDto> todoDtoList = new ArrayList<TodoListRespDto>();



/*
 * page를 index로 바꿔주고
 * index를 레파지토리로 
 * 나온 여러개의 결과값을 todoDtoList에 담기
 */

todoRepository.getTodoListOfIndex((page -1)*10).forEach(todo ->{
	todoDtoList.add(todo.toTodoListRespDto());
});
	return todoDtoList;
}
}
	


