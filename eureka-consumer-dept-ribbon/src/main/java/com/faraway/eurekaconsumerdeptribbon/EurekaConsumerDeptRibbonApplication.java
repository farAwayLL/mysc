package com.faraway.eurekaconsumerdeptribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author faraway
 * @date 2019/1/24 17:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaConsumerDeptRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerDeptRibbonApplication.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
