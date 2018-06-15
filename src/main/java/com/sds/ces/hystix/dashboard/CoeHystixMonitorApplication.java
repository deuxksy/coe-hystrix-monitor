package com.sds.ces.hystix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableHystrixDashboard
@EnableTurbine
public class CoeHystixMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoeHystixMonitorApplication.class, args);
    }
}
