package com.example.SpringBootRestAPIWithSpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")  // enable @RestController, @Service , @Repository 
@EntityScan(basePackages = "com.entity")   // to enable @Entity orm 
@EnableJpaRepositories(basePackages = "com.repository") // to enable spring jpa data features 
public class SpringBootRestApiWithSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiWithSpringDataApplication.class, args);
		System.out.println("Spring Boot Up");
	}

}