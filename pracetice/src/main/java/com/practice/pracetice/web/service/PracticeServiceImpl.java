package com.practice.pracetice.web.service;

import java.util.ArrayList;
import java.util.List;

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
	
	
	@Override
	public List<PracticeRespDto> pageLoadService(int page) throws Exception {
		
		List<PracticeRespDto> dtos = new ArrayList<>();
		// limit 0,10은 0번 부터 10개 , 10,10 은 10부터 10개
		int index = (page -1) *10;
		
		List<Practice> practices =  practiceRepository.pageLoadRepository(index);
		// index는 limit의 앞ㅇ 들어갈거임
		// 리스트로 담은 이유가 index,10 이런식으로 해서 0~ 10개의 게시물 거자열로겨ㅗ
		
		System.out.println(practices);
		
		for(int i = 0; i < practices.size(); i++)
		{
			System.out.println(practices.get(i)); 
			dtos.add((practices.get(i)).toDto());
			
			
			
		}
		
		
		practices.forEach(practice -> {
			dtos.add(practice.toDto());
		});
		
		return dtos;
	}


}
