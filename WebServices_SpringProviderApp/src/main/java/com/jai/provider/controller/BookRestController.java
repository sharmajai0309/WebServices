package com.jai.provider.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.provider.entity.Book;

import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("v1/api/book")
public class BookRestController {
/*
 * 
 * Method :   GET
 * PATH   :  /showA
 * RT     :  ResponseEntity<String>
 * Input  :  No input
 */
	@GetMapping("/showA")
	public ResponseEntity<String>showmsg1() {
		return ResponseEntity.ok("Welcome To First CAll Type - Get");
	}
	
	
	/*
	 * 
	 * Method :   GET
	 * PATH   :  /showb/{id}/{name}
	 * RT     :  ResponseEntity<String>
	 * Input  :  {id}/{name}
	 */
	
	@GetMapping("/showb/{id}/{name}")
	public ResponseEntity<String>showmsg2(@PathVariable Integer id , @PathVariable String name){
          return ResponseEntity.ok("Welcome new id " + id + " With name " + name);
	}
	
	
	
	@GetMapping("/showc/{id}")
	public ResponseEntity<?> showmasg3(@PathVariable Integer id) {
	    Book b = new Book(12, "DSA", "PW", 300.90);

	    // Return a 404 if id does not match
	    if (id != 12) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found: " + id);
	    }

	    // If the id is 12, return the book
	    return ResponseEntity.ok(b);
	}

	
	
	
	
	
	
	
}
