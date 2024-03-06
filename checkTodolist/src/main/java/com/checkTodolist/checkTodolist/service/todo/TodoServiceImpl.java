package com.checkTodolist.checkTodolist.service.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.checkTodolist.checkTodolist.domain.todo.Todo;
import com.checkTodolist.checkTodolist.domain.todo.TodoRepository;
import com.checkTodolist.checkTodolist.web.controller.dto.CreateTodoReqDto;
import com.checkTodolist.checkTodolist.web.controller.dto.TodoListRespDto;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
	
	private final TodoRepository todoRepository;
	// 게시글 생성 구문
	@Override
	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception {
		
		String content = createTodoReqDto.getTodo();
		
	
		
//		for(int i=0; i<200; i++) {
//		
//			if(i%2 == 0)
//			{
//				todo.setImportance_flag(1);
//			}else
//			{
//				todo.setImportance_flag(0);
//			}
//			
//			todo.setTodo_content(content + "_" + (i + 1));
//			todoRepository.save(todo);
//			
//			
//		}
//		
		
		
		return todoRepository.save(createTodoReqDto.toEntity()) > 0;
	}

	@Override
	public List<TodoListRespDto> getToList(int page, int contentCount) throws Exception {
	
		Map<String, Object> map = new HashMap<String , Object>();
		map.put("index", (page - 1 ) * contentCount);
		map.put("count", contentCount);
		map.put("type", "1");
		
		
		List<Todo> todolist = todoRepository.getTodoListOfIndex(map);
		
	     List<TodoListRespDto> todoListRespDtos = new ArrayList<TodoListRespDto>();
	      todolist.forEach(todo -> {
	         todoListRespDtos.add(todo.toListDto());
	      });

 		
		return todoListRespDtos;
	}
	
	
}
