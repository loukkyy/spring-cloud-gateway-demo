package com.loukkyy.springcloudgatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
public class SpringCloudGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayDemoApplication.class, args);
	}
}
