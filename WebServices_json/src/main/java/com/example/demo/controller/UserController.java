package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.Role;
import com.example.demo.rest.User;

@RestController
@RequestMapping(value = "v1/api/User")
public class UserController {
	
	/*
	 * RT = ResponseEntity<User>
	 * INPUT = NoInput
	 * Method = GET
	 * PARAM = /get
	 */
	
	@GetMapping("/get")
	public ResponseEntity<User> getUserDetails() {
	    User user = new User(
	        12, 
	        "JAI", 
	        "SDE", 
	        "WOLF", 
	        Set.of("JAI", "DIVYA", "DIBBU"), 
	        Map.of("JAVA", 12,"AWS",56,"DATABASE",3)
	    );
	    ResponseEntity<User> response = new ResponseEntity<>(user, HttpStatus.OK);
	    return response;
	}

//-----------------------------------------------------------------------------	
	
	
	/*
	 * RT = ResponseEntity<User>
	 * INPUT = NoInput
	 * Method = GET
	 * PARAM = /List
	 */
	
	@GetMapping("/List")
	public ResponseEntity<List<Role>> getListDetails() {
	    List<Role> body = null;
	    Role r1= new Role(12,"SDE");
	    Role r2= new Role(13,"SDE-I");
	    Role r3= new Role(14,"SDE-II");
	    
	    body = List.of(r1,r2,r3);
	    ResponseEntity<List<Role>> response = new ResponseEntity<>(body,HttpStatus.OK);
	    String msg  = "List details";
	    System.out.println(msg);
		return response;
	        
	}
	//-----------------------------------------------------------------------------	
	
	
		/*
		 * RT = ResponseEntity<User>
		 * INPUT = NoInput
		 * Method = GET
		 * PARAM = /Map
		 */
		
	@GetMapping("/Map")
	public ResponseEntity<List<Map<String, Role>>> getMapDetails() {
	    Role r1 = new Role(12, "SDE");
	    Role r2 = new Role(13, "SDE-I");
	    Role r3 = new Role(14, "SDE-II");
	    
	    // Create a map of roles
	    Map<String, Role> roleMap = Map.of("DEV", r1, "OPS", r2, "HR", r3);
//	    Map<String, Role> roleMap1 = Map.of("DEV", r1, "OPS", r2, "HR", r3);
	    
	    // Wrap the map inside a list
	    List<Map<String, Role>> body = List.of(roleMap);
	    
	    // Create ResponseEntity with the list and HttpStatus.OK
	    ResponseEntity<List<Map<String, Role>>> response = new ResponseEntity<>(body, HttpStatus.OK);
	    
	    // Print a message
	    
	    System.out.println("Map details");
	    
	    // Return the response
	    return response;
	}

		

	
	
}
