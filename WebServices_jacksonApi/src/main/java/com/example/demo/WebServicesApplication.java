package com.example.demo;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Account;
import com.example.entity.Order;
import com.example.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication
public class WebServicesApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebServicesApplication.class, args);
		Order order = new Order(12, "laptop", true, "good");
		Order order1 = new Order(13, "mobile", true, "good");
		Order order2 = new Order(14, "watch", true, "good");
		
		Account account = new Account("1234567890", "HDFC", new BigDecimal(12345678));
		Person person = new Person("Sachin","Sharma","@gmail.com",new Date(),List.of(order,order1,order2),account);
		
		// user jackson API and convert java object to json
		
		
		ObjectMapper mapper = new ObjectMapper();
//		System.out.println("Serializing Started");
//		mapper.enable(SerializationFeature.INDENT_OUTPUT);
//		mapper.writeValue(new File("data/person1.json"),person);
//		System.out.println("Serializing Completed");
		File file = new File("data/person.json");
		Person person2 = mapper.readValue(file, Person.class);
		System.out.println(person2);
		
		
		
	
	
		
		
	}

}
