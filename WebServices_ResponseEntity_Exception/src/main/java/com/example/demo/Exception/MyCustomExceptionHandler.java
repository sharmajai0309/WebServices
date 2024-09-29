package com.example.demo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.bean.MyErrorResponse;

@RestControllerAdvice
public class MyCustomExceptionHandler {
	
	
//	@ExceptionHandler(value = ProductNotFoundException.class)
//	public ResponseEntity<String>CustomMsg(ProductNotFoundException pnfe){
//		
//		return new ResponseEntity<String>(pnfe.getMessage(), HttpStatus.NOT_FOUND);
//		
//	}
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse>CustomMsg(ProductNotFoundException pnfe){
		
		MyErrorResponse m = new MyErrorResponse();
		m.setCode(404);
	m.setDate(new Date());
		m.setMessage("Product not found");
		m.setStatus("404");
		
		return new ResponseEntity<MyErrorResponse>(m, HttpStatus.NOT_FOUND);
		
	}


	
	 
	
}
