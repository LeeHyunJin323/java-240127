package com.example.todolist3.web.controll.api.list;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.todolist3.domain.content.service.content.TodoService;
import com.example.todolist3.web.dto.CMRespDto;
import com.example.todolist3.web.dto.CreateTodoReqDto;
import com.example.todolist3.web.dto.TodoListRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor
public class TodoController {
 
	private final TodoService todoService;
	@PostMapping("/content")
	public ResponseEntity<?> addContent(@RequestBody CreateTodoReqDto createTodoReqDto)
	{
		boolean result = false;
		try {
			result=	todoService.createTodo(createTodoReqDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",result));
		}
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",result));
	}
	
	 
	
	@GetMapping("/list")
	public ResponseEntity<?> getTodoList(int page)
	{
		
		List<TodoListRespDto> todoDtoList = null;
		
		try {
			todoDtoList = todoService.getTodoList(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "작성 실패" , todoDtoList));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "작성 성공" , todoDtoList));
	}
}



