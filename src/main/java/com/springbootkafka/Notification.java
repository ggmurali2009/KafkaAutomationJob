package com.springbootkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"org.mongodb","com.springbootkafka"})
public class Notification {

	public static void main(String[] args) {

		SpringApplication.run(Notification.class, args);

	}

}
