package com.example.demo.restrcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

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
	
	@GetMapping("/load")
    public ResponseEntity<String> getMethodName(@RequestHeader Map<String, String> headers) {
        System.out.println("Parameters Received");

        // Loop through the headers and print them
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header: %s, Value: %s", key, value));
        });

        return new ResponseEntity<>(String.format("Listed %d Headers", headers.size()), HttpStatus.OK);
	
	
	}
};
	

	
	

