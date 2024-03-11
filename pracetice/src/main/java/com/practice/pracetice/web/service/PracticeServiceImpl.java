package com.practice.pracetice.web.service;

import org.springframework.stereotype.Service;

import com.practice.pracetice.domain.practice.Practice;
import com.practice.pracetice.domain.practice.PracticeRepository;
import com.practice.pracetice.web.dto.PracticeBoardReqDto;
import com.practice.pracetice.web.dto.PracticeRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PracticeServiceImpl implements PracticeService{

	
	private final PracticeRepository practiceRepository;
	
	@Override
	public PracticeRespDto testService(int num) throws Exception{
		
		System.out.println("serviceNum" + num);
		
	Practice practice =	practiceRepository.findBoard(num);
	// practice에서 board_id 값을 num을 받고 그 게시물 띄움
	System.out.println(practice);
	
	PracticeRespDto practiceRespDto = practice.toDto();
		return practiceRespDto;
	}
	
	
	@Override
	public boolean dataInputService(PracticeBoardReqDto practiceBoardReqDto) throws Exception {
	
	     Practice practice =  practiceBoardReqDto.toEntity();
	     
	  int num =   practiceRepository. boardInput(practice); // boardInput 3을 리턴
	  // num = 3 
	     System.out.println(num);
	     
		return false;
	}

}
