package com.nan.eurekaservernan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerNanApplication {
//testcherrypick
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerNanApplication.class, args);
	}
}
