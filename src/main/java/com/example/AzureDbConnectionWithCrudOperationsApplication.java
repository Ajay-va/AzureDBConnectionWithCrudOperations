package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureDbConnectionWithCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDbConnectionWithCrudOperationsApplication.class, args);

		System.out.println("Welcome to Azure DB Deployment...!!!!!");
	}

}
