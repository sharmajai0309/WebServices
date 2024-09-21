package com.example.demo.restrcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("v1/api/product")
public class ProductRestController {
	
	@GetMapping("get/{pid}/{pname}")
	public ResponseEntity<String> getProduct(@PathVariable Integer pid, @PathVariable String pname){
		System.out.println("Parameters Recived");
		System.out.println(pid);
		System.out.println(pname);
		return new ResponseEntity<String>("PID = " + pid + " PNAME = " + pname,HttpStatus.OK);
		
		
	}
	
	}
	

	
	

