package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class J1906SpcEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpcEurekaserverApplication.class, args);
    }

}
