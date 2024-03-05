package com.springboot.web2hyunjin20240220.domain.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardRepository {
		
	public int save(Board board);
	// save는 데이터베이스에 저장하는 역할
	
	public Board findBoardByBoardcode(int boardcode);
	
	public List<Board> getBoardListOfIndex(int index);
}

