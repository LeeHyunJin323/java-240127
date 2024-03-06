package com.example.todolist3.domain.content;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper 
// Mapper = 디비연결, 서비스 연결
//컨테이너에 등록 -> 계속 생성할 수 없으니 같은걸 여러번쓰기 위해서
public interface TodoRepository {

	public int save(Todo todo) throws  Exception;
	public List<Todo> getTodoListOfIndex(int index)throws Exception;
	// 엔티티를 db에 넣음
	
}
