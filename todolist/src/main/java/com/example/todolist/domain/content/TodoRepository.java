package com.example.todolist.domain.content;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper 
// Mapper = 디비연결, 서비스 연결
public interface TodoRepository {

	public int save(Todo todo) throws  Exception;
	public List<Todo> getTodoListOfIndex(int index) throws Exception;
	
}
