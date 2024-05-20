package com.Springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServicesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProjectApplication.class, args);
	}

}
