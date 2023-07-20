package com.tbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@Configuration, @EnableAutoConfiguration , @ComponentScan
@SpringBootApplication
public class TbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbsApplication.class, args);
		System.out.println("Ticket Reservation For Airline system is running...");
	}

}
