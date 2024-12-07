package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.exam")
@EntityScan(basePackages = "com.klef.jfsd.exam.model")
@EnableJpaRepositories(basePackages = "com.klef.jfsd.exam.repository")
public class EndSemLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndSemLabApplication.class, args);
		System.out.print("project is Running");
	}

}
   