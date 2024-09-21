package com.example.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    private Integer empId;
    private String empName;
    private Double empSal;
    
    private Address address;
    private List<String> names;
    private Set<String> employees;
    private Map<String, Long> details;
}
