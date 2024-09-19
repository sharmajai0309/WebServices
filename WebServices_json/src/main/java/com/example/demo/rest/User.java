package com.example.demo.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


	@JsonProperty("USERID")
	private Integer Id;
	
	@JsonProperty("USERNAME")
	private String name;
	
	@JsonProperty("Roles")
	private String UserRole;
	
	@JsonIgnore
	private String Password;
	
	private Set<String> friends;
	private Map<String,Integer> team;
}
