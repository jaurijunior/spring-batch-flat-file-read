package com.example.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchFileFlatReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchFileFlatReadApplication.class, args);
	}

}
