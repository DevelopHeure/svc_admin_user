package com.devheure.microservices.svcmanageuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SvcManageUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcManageUserApplication.class, args);
	}
}
