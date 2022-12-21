package com.adopcion.gatewayservise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;

@SpringBootApplication
@EnableEurekaClient
public class GatewayServiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiseApplication.class, args);
    }

}
