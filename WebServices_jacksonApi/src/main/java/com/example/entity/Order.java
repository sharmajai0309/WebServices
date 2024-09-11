package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private int id;
    private String productName;
    private boolean isDelivered;
    private String feedback;
	
}
