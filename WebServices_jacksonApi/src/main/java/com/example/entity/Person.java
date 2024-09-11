package com.example.entity;

import java.math.BigDecimal; 

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private List<Order> orders;
    private Account account;

    
    }
