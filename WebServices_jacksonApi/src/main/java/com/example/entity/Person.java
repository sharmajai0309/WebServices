package com.example.entity;

import java.util.Date;
import java.util.List;


import com.example.searilization.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
    private String firstName;
    private String lastName;
    private String email;
    
    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = com.example.entity.Deserilization.CustomDateDeserilization.class)
    private Date birthDate;
    private List<Order> orders;

    private Account account;

    
    }
