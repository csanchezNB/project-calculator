package com.sanitas.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.corp.calculator.TracerImpl;

/**
 * 
 * Main Class.
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public TracerImpl tracerAPI() {
		return new TracerImpl();
	}

}
