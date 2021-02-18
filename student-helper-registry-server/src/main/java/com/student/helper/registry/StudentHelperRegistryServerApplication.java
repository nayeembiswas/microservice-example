package com.student.helper.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentHelperRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentHelperRegistryServerApplication.class, args);
	}

}
