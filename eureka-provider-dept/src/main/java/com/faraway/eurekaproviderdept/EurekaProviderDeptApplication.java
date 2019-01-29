package com.faraway.eurekaproviderdept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author faraway
 * @date 2019/1/24 16:40
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.faraway.common.mapper")
public class EurekaProviderDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderDeptApplication.class);
    }
}
