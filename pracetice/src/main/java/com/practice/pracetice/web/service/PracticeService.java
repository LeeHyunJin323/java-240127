package com.practice.pracetice.web.service;

import java.util.List;

import com.practice.pracetice.web.dto.PracticeBoardReqDto;
import com.practice.pracetice.web.dto.PracticeRespDto;

public interface PracticeService {

	
	public PracticeRespDto testService(int num) throws Exception;
	
	public boolean dataInputService(PracticeBoardReqDto practiceBoardReqDto) throws Exception;
	
	public List<PracticeRespDto> pageLoadService(int page) throws Exception;
	

}