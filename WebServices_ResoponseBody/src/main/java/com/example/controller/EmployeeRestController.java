package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	
	/*
	 * RT      - ResponseEntity
	 * PATH    - /save
	 * Input   - Employee @RequestBody
	 * METHOD  - POST
	 * 
	 * 
	 */
	
	@PostMapping("/save")
	public ResponseEntity<String>saveObject(
			@RequestBody Employee employee) {
		String body = employee.toString();
		System.out.println("controller sarted");
		  ResponseEntity<String> response = new ResponseEntity<>(body, HttpStatus.CREATED);
		
		
		return response;
	}
	
	
}
