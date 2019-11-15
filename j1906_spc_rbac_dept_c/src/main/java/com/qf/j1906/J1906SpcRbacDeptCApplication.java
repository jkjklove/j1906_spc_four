package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix//启动Hystrix熔断
@EnableDiscoveryClient
@SpringBootApplication
public class J1906SpcRbacDeptCApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpcRbacDeptCApplication.class, args);
    }

}
