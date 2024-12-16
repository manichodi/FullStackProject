package com.example.ListEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("com.repo")
@ComponentScan({"com.controller","com.service"})
@EntityScan("com.dto")
public class ListEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListEmployeeApplication.class, args);
	}

}
