package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
public class SpringBoot13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13Application.class, args);
	}
}
