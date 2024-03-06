package com.example.todolist.web.dto;

import com.example.todolist.domain.content.Todo;

import lombok.Builder;
import lombok.Data;


@Data
public class CreateTodoReqDto {
    private String content;
    private int usercode;

    public Todo toEntity() {
        return Todo.builder()
                .content(content)
                .user_code(usercode)
                .build();
    }
}
