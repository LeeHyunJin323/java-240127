package com.springboot.web2hyunjin20240220.service.board;

import org.springframework.stereotype.Service;

import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardReqDto;

@Service // 인터페이스나 추상으로 구현된 곳에 붙여주면 
// IOC 맨밑에 등록이 됨 
public class BoardServiceImpl implements BoardService{
	

	//BoardService에 있는 createBoard를 재정의
    @Override
    public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
        return true; 
        
        // true는 게시글 생성 성공했다는 뜻인데 그럼 
        //지금 상태는 항상 성공
	
	
//	@Override
//	public boolean createBoard(CreateBoardReqDto boardReqDto) throws Exception {
//		System.out.println(boardReqDto);
//		return true;
//	}

}
}
