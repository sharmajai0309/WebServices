package com.example.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(content = Include.NON_NULL)
public class Order {
	  private Integer id;
	    private String productName;
	    private boolean delivered;
	    private String feedback;
}
