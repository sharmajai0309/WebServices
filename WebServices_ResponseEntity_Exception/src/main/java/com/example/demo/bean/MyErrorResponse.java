package com.example.demo.bean;

import java.util.Date;

import lombok.Data;

@Data
public class MyErrorResponse {
	private Date date;
	private String Status;
	private int code;
	private String message;
}
