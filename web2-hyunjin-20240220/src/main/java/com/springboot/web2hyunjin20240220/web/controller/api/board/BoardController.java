package com.springboot.web2hyunjin20240220.web.controller.api.board;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2hyunjin20240220.service.board.BoardService;
import com.springboot.web2hyunjin20240220.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;
//게시판 (board) crud

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	//객체를 만들고 required 붙여주면 
	private final BoardService boardService;
//	@PostMapping("/content")
//	public ResponseEntity<?> addBoard(String title){
//		System.out.println("게시글 작성완료");
//		System.out.println("title : " + title);
//		return new ResponseEntity<>(title+"게시글 작성성공",HttpStatus.OK);
//		//객체를  생성해서 리턴한거임
//	}
	
//	@PostMapping("/nowContent")
//	public ResponseEntity<?> addBoardNow(String title, int usercode, String content)
//	{
//		System.out.println("title: "+title);
//		System.out.println("usercode: "+usercode);
//		System.out.println("content: "+content);
//		return ResponseEntity.ok().body("test");
//	} // 여기서 리턴값은 게시물을 업로드 했을때 성공했다는 메세지를 띄우는 용도
	/*
	 *   GET은 주로 데이터를 요청하는 데 사용되며, 
	 *   POST는 데이터를 서버에 제출하여 리소스를 생성하거나 
	 *   업데이트하는 데 사용됩니다
	 */
	
	/*
	 * 요청 방식 post 
	 * 요청 주소 /api/v1/voard/content
	 * title: 제목
	 * usercode:1
	 * content:내용내용
	 * 리턴값: 받은 내용 쭉 출력
	 * 
	 * 
	 * 출력
	 * title:제목
	 * usercode:1
	 * content : 내용내용
	 * 리턴값 test
	 */
	
//	@PostMapping("/nowContent")
//	public ResponseEntity<?> addBoardNow(CreateBoardReqDto createBoardReqDto)
//	{
//		createBoardReqDto.showInfo(); // 값이 안들어감
//		//private 상태라 setter로 값을 넣어줘야해서 @data 달아줘야함
////		System.out.println("title: "+title);
////		System.out.println("usercode: "+usercode);
////		System.out.println("content: "+content);
//		return ResponseEntity.ok().body("test");
//	} // 받은값은 서비스에 던져줘야함
	
	/*
	 * !! 리턴값이 ResponseEntiy인 이유 
	 * 리턴에서 body에서 값을 넣어서 리턴해줌
	 * 결국 int string 이런거 계속 설정안하기 위해서임 
	 * Object라고 생각하면될듯
	 */

	@PostMapping("/content")    //Json으로 받을때는 RequestBody 붙여줘야함
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto){
//		boardService.createBoard(createBoardReqDto) 는 게시글 생성이라고 보면됨
		// responseData는 게시글 생성이 성공했는가? 
		boolean responseData = false;
		try {
			System.out.println(createBoardReqDto);
			responseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
			// 서버 에러라고 말해주고 밖으로 나감	
		}
		return ResponseEntity.ok().body(responseData);
	}
	

}