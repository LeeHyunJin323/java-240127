package com.springboot.web2hyunjin20240220.domain.board;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardRepository {
		
	public int save(Board board);
}