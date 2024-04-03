package com.micro.user.service.UserService.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
    @Bean
    @LoadBalanced   //to use direct service name instead of port
    public RestTemplate restTemplate(){  //to call another service
        return new RestTemplate();
    }
}
