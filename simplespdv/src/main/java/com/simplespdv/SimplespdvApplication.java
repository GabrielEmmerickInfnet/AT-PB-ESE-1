package com.simplespdv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.simplespdv.client")  // Ativando o Feign Client
public class SimplespdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplespdvApplication.class, args);
	}
}
