package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackendDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c =SpringApplication.run(BackendDataApplication.class, args);
		Register reg = c.getBean(Register.class);
	    reg.show();
		
	}

}
