package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class J1906SpcRbacEmpCApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpcRbacEmpCApplication.class, args);
    }

}
