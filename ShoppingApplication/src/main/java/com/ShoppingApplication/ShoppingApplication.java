package com.ShoppingApplication;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingApplication {

	public static  org.slf4j.Logger logger=LoggerFactory.getLogger(ShoppingApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("application started...");
	}
	public static void main(String[] args) {
		
		logger.info("application running........");
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
