package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ProductNotFoundException;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {
	
	/*
	 * METHOD :GET
	 * PATH   :/one/{id}
	 * INPUT  : id(@Pathvariable)
	 * R.T    : ResponseEntity<String>
	 * 
	 */
	
//	CASE 1: Default Exception Handler[BasicErrorController: error(request)]
	
//		@GetMapping("/one/{id}")
//		public ResponseEntity<String> getProductById
//		(
//				@PathVariable Integer id
//		) 
//		{
//			if(id==150) 
//			{
//				return new ResponseEntity<>("Product Exist", HttpStatus.OK);
//			}
//			else {
//				throw new RuntimeException("Product Not Found " + id);
//			}
//		}
	
	
//	CASE 1: Exception is handles by pur custon exception handler
	@GetMapping("/one/{id}")
    public ResponseEntity<String> getProductById(@PathVariable Integer id) {
        if (id == 150) {
            return new ResponseEntity<>("Product Exists", HttpStatus.OK);
        } else {
            throw new ProductNotFoundException("Product Not Found with ID: " + id);
        }
    }
}
