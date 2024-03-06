package com.example.todolist3.web.dto;

import com.example.todolist3.domain.content.Todo;


import lombok.Data;


@Data
public class CreateTodoReqDto {
    private String content;
    private int usercode;
// 처음에 컨트롤러에서 이값을 받아옴 
    // "안녕" , 1 
    // 그 값을 entity로 변경해서 db로 전달
    // 근데 Todo라는 entity로 바꿔야함
// 근데 Todo 에는 변형해야할 녀석들이 content랑 user_code 뿐임
    // 나머지는 자동으로 들어옴

    public Todo toEntity() {
    	
        return Todo.builder()
                .content(content)
                .user_code(usercode)
                .build();
    }
    
    
	
	
//	public Board toEntity() {
//		
//		return Board.builder()
//				.title(title)
//				.usercode(usercode)
//				.content(content)
//				.build();
//	}
}
