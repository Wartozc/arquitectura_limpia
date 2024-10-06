package com.co.hotel.HotelApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(value = {"co.com.hotel"})
public class HotelApplication {
	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}

}
