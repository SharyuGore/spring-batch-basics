package com.sharyu.springbatchbasics;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchBasicsApplication.class, args);
	}

}
