package com.example.todolist.domain.content;

import java.time.LocalDateTime;

import com.example.todolist.web.dto.TodoListRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Todo {

	private int content_code;
	private String content;
	private int user_code;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
	private String user_name;
	
	
	
	public TodoListRespDto toTodoListRespDto()
	{
		return TodoListRespDto.builder()
				.userName(user_name)
				.contentCode(content_code)
				.content(content)
				.build();
	}
}
