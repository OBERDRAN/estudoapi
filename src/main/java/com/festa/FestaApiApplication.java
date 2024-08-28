package com.festa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties
public class FestaApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(FestaApiApplication.class, args);
	}
}
