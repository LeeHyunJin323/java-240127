package com.study.security20240312hyunjin.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.study.security20240312hyunjin.handler.exception.CustomValidationApiException;
import com.study.security20240312hyunjin.web.dto.CMRespDto;


@RestController
@ControllerAdvice   //전체 컨트롤러에 대해서 
public class RestControllerExceptionHandler {
   
   // exceptionhandler 하나의 클래스에 대해서
   @ExceptionHandler(CustomValidationApiException.class)
   public ResponseEntity<?> validationApiException(CustomValidationApiException e){
      return ResponseEntity.badRequest().body(new CMRespDto<>(-1,e.getMessage() + "ji",e.getErrorMap()));
      
      
   }
   }
