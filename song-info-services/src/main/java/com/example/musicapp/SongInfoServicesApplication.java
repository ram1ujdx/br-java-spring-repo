package com.example.musicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SongInfoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongInfoServicesApplication.class, args);
	}

}
