package com.get;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.get.repository")
public class ProjectManagementSystem {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementSystem.class, args);
	}

}
