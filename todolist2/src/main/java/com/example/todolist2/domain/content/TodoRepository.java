package com.example.todolist2.domain.content;



import org.apache.ibatis.annotations.Mapper;

@Mapper 
// Mapper = 디비연결, 서비스 연결
public interface TodoRepository {

	public int save(Todo todo) throws  Exception;
	
	// 엔티티를 db에 넣음
	
}
