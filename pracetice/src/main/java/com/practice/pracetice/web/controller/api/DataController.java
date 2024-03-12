package com.practice.pracetice.web.controller.api;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.pracetice.domain.practice.PracticeRepository;
import com.practice.pracetice.web.dto.CMRespDto;
import com.practice.pracetice.web.dto.Info;
import com.practice.pracetice.web.dto.Info2;
import com.practice.pracetice.web.dto.PracticeBoardReqDto;
import com.practice.pracetice.web.dto.PracticeRespDto;
import com.practice.pracetice.web.service.PracticeService;
import com.practice.pracetice.web.service.PracticeServiceImpl;

import lombok.Builder;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class DataController {

	private final PracticeService practiceService;
	
	
	@GetMapping("/dataController")
	public String dataController() {
		return "hihihi";
	}
	
	
	// 값 주입 : setter , builder , 생성자 , 주소참조
	//여러개 받을땐 클래스 객체로 받음 

	@PostMapping("/dataInsertMany")
	public ResponseEntity<?> dataInsertMany(Info info)
	{
	
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",info));
	}

	// 파람으로 값 받기
	@PostMapping("/dataInsert")
	public String dataInsert(String name) {
		return name;
		
	}
	
	// JSON으로 값 받기
	//@RequestBody 이 필요함
	@PostMapping("/dataJson")
	public String dataJson(@RequestBody String name) {
		return name ;
	}
	
	
	@PostMapping("/dataJsonsMany")
	public ResponseEntity<?> dataJsonMany(@RequestBody Info2 info2) {
	
		
//		boolean result = false;
//		
//		try {
//			result = todoService.createTodo(createTodoReqDto);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패",result));
//		}
//		
//		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",result));
//	}
	
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",info2));
	}
	
	// url에서 값 추출해서 받기
	
	
	@PostMapping("/dataUrl/{num}")
	public ResponseEntity<?> dataUrl(@PathVariable int num) {
		System.out.println(num);
//		
//		PracticeService practiceService = new PracticeServiceImpl();
//		
//		practiceService.testService(num);
		PracticeRespDto practiceRespDto =null;
		try {
			 practiceRespDto = practiceService.testService(num);
		} catch (Exception e) {
			
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"실패", practiceRespDto));
		}
		
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공", practiceRespDto));
	}
	
	
	@PostMapping("/dataInput")
	public ResponseEntity<?> dataInput(@RequestBody PracticeBoardReqDto practiceBoardReqDto){
		// title, content,userid
		// JSON으로 위의 내용 받기
		// JSON으로 받은거 리턴하기 
		
		try {
			practiceService.dataInputService(practiceBoardReqDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공",practiceBoardReqDto));
	}
	
	
	@PostMapping("page")
	public ResponseEntity<?> pageLoad(int page)
	{
		List<PracticeRespDto> list = null;
		
	     
		try {
			list = practiceService.pageLoadService(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"성공", list));
	}
	
}
