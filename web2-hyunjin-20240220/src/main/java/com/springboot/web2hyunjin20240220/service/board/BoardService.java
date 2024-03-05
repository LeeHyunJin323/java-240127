package com.springboot.web2hyunjin20240220.service.board;

import java.util.List;

import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.web2hyunjin20240220.web.dto.board.ReadBoardRespDto;

public interface BoardService {

	   public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto)throws Exception;
	   //CreateBoardReqDto의 매개변수를 받아서 게시글 생성하는 기능 수행
	   public ReadBoardRespDto readBoard(int boardcode) throws Exception;

// readBoard -> Dto를 반환할거고 그 dto를 만들어줘서 반환값으로 쓸예정
	   
	   //readBoardList
	 public List<ReadBoardRespDto> readBoardList(int page) throws Exception;
	   
	 
	 
}
