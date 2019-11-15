package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class J1906SpcRbacEmpPApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpcRbacEmpPApplication.class, args);
    }

}
