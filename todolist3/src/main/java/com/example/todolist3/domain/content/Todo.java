package com.example.todolist3.domain.content;



import java.time.LocalDateTime;

import com.example.todolist3.web.dto.TodoListRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Todo {

	// 여기는 dto값 전부 다 받아야한다.
	
//	private String usercode;
//	private String username;
//	private String passwrod;
//	private String name;
//	private String createdate;
//	private String updatedate;
	
	private int content_code;
	private String content;
	private int user_code;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
	private String user_name;
	
	public TodoListRespDto toTodoListRespDto() {
		return TodoListRespDto.builder()
				.userName(user_name)
				.contentCode(content_code)
				.content(content)
				.build();
	}
	
}
