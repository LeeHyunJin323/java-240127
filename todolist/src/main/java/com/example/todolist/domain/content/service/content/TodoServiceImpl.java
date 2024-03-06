package com.example.todolist.domain.content.service.content;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todolist.domain.content.Todo;
import com.example.todolist.domain.content.TodoRepository;
import com.example.todolist.web.dto.CreateTodoReqDto;
import com.example.todolist.web.dto.TodoListRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {


	private final TodoRepository todoRepository;
@Override
public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception {
	Todo todoEntity = createTodoReqDto.toEntity();
	//! 엔티티변경
	// dto에서 entity로 바뀐값이 todoEntity에 들어감
	
//	for(int i= 0; i < 100 ; i++)
//	{
//		todoEntity = Todo.builder()
//				.content("게시글" + (i+1))
//				.user_code(1)
//				.build();
//		
//		todoRepository.save(todoEntity) > 0;
//	}
	
// save = 저장된 개수만큼 그래서 0보다 클때 리턴해준다	
	return todoRepository.save(todoEntity) > 0;
	//! 레파지토리로 던져줌
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
