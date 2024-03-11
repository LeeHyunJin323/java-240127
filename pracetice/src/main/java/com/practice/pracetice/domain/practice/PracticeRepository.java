package com.practice.pracetice.domain.practice;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PracticeRepository {

	/*
	 * testService라는 곳에서 num을 던져줄거임
	 * num으로 머를 찾을 거임? board_id에 넣어서 게시글
	 * 
	 */
	
	public Practice findBoard(int num) throws Exception;
	
	public int boardInput(Practice practice) throws Exception;
}
