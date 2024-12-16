package com.example.BackEndUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@ComponentScan({"com.controller","com.service"})
@EnableJpaRepositories("com.repo")
@EnableAutoConfiguration
@EntityScan("com.dto")
public class BackEndUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndUserApplication.class, args);
	}

}
