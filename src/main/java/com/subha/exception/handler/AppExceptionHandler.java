package com.subha.exception.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		return e.getMessage();
	}

}
