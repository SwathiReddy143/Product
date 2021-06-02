package com.example2.demo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFounfException.class)
	public ResponseEntity<ErrorDetails> handlerResourceNotFoundException(ResourceNotFounfException exception,WebRequest request){
		
		
		ErrorDetails errorDetials=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(errorDetials,HttpStatus.NOT_FOUND);
		
	}

}
