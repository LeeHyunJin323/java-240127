package com.springboot.web2hyunjin20240220.service.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web2hyunjin20240220.domain.board.Board;
import com.springboot.web2hyunjin20240220.domain.board.BoardRepository;
import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.web2hyunjin20240220.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;


@Service	
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardRepository boardRepository;
	// 의존성 주입
	// 현재 BoardRepository는 인터페이스임 , save를 사용하기 위해 이런식으로 한듯?
	// save는 데이터베이스로 저장하는 역할
	
	// 지금 해야할 일이 서비스의 객체 dto를 레파지토리에 entity값으로 던져줘야함 
	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto boardReqDto) throws Exception {
		
		 Board boardEntity = boardReqDto.toEntity();	//디비에 넣기위해 엔티티로 바꿈
		// 게시글이 작성되는 순간 dto값이 entity로 레파지토리에 던져짐
		
//		System.out.println("DB가기전: " + boardEntity); // 가기전엔 유저가 값을 넣어둔 title,usercode,content값이 들어있음 dto에 우리가 그렇게 설정 해났기때문
//		int result = boardRepository.save(boardEntity);	 
//		System.out.println("숫자result:" +result);
//		System.out.println("DB갔다온 후:" +boardEntity); // db에 갔다왔을땐 우리가 설정 안한 값들이 나머지 설정됨 왜냐면 오토인크리먼트나 now로 값을 디비에서 설정해둠
//			
		
		//for(int i = 0 ; i < 100; i++) {
		//	Board board = Board.builder()
			//		.title("게시글" + (i+1))
			//		.usercode(1)
			//		.content("내용내용" +(i+1))
			//		.build();
			
		//	boardRepository.save(board);
			
					
		
		
		//}
		
		boolean insertStatus = boardRepository.save(boardEntity) > 0;
		// 게시글이 작성되는 순간 dto값이 entity로 레파지토리에 던져짐
		// board.xml 에서 돈만큼 리턴값이 잡힘 -> 1번돌면 1이 잡히는듯	
		
		//System.out.println(boardEntity.toCreateBoardDto(insertStatus));
		return boardEntity.toCreateBoardDto(insertStatus);
    
		
		

	}

	@Override
	public ReadBoardRespDto readBoard(int boardcode) throws Exception {
		
		return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
		// 보드레파지토리 인터페이스 안에있는 findboard에 입력된 값을 dto로 변형해서 리턴
		// board라는 엔티티 
		
	}
	
	
	@Override
	public List<ReadBoardRespDto> readBoardList(int page) throws Exception {
		 
		int index = (page -1 ) * 10;
		
		
		List<ReadBoardRespDto>  boardDtoList = new ArrayList<ReadBoardRespDto>();
		
		
	//	System.out.println(boardRepository.getBoardListOfIndex(index));
		//for(int i = 0 ; i < 100; i++) {
		//	Board board = Board.builder()
			//		.title("게시글" + (i+1))
			//		.usercode(1)
			//		.content("내용내용" +(i+1))
			//		.build();
			
		//	boardRepository.save(board);
		
	   // List<Board> boardList = boardRepository.getBoardListOfIndex(index);

	   
	   // for (int i = 0; i < boardList.size(); i++) {
	   //     Board board = boardList.get(i);
	   //     boardDtoList.add(board.toReadBoardDto());
	  //  }
		
		
         	boardRepository.getBoardListOfIndex(index).forEach(board -> {
			boardDtoList.add(board.toReadBoardDto());
			
			
		});
	
		
		return boardDtoList;
		

	}
}

