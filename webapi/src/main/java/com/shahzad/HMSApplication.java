package com.shahzad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.shahzad.*" })
@EntityScan(basePackages = { "com.shahzad.*" })
@EnableJpaRepositories(basePackages = { "com.shahzad.*" })
public class HMSApplication {

	public static void main(String[] args) {

		SpringApplication.run(HMSApplication.class);
	}
}
