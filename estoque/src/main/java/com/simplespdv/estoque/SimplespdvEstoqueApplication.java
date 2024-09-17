package com.simplespdv.estoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimplespdvEstoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplespdvEstoqueApplication.class, args);
	}

}
