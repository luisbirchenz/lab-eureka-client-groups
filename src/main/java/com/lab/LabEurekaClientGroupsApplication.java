package com.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LabEurekaClientGroupsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabEurekaClientGroupsApplication.class, args);
	}

}
