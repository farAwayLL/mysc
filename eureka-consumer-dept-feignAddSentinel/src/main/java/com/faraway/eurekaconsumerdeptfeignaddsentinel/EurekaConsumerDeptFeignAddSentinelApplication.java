package com.faraway.eurekaconsumerdeptfeignaddsentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author faraway
 * @date 2019/1/25 14:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaConsumerDeptFeignAddSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerDeptFeignAddSentinelApplication.class);
    }
}
