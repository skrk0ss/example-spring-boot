package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {AppConfig.class})
public class SimpleBootAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBootAopApplication.class, args);
	}


}
