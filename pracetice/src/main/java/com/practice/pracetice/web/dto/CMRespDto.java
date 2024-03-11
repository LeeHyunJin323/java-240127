package com.practice.pracetice.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

// CMrespdto에 담아서 리턴할거임 무조건
public class CMRespDto<T> {

	private int code; // 성공하면 1 실패하면 -1
	private String message; // 오류 내용
	private T data; // true나 false or 리드값
	
}
