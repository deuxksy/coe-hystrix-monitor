package com.sds.act.coehystixmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CoeHystixMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoeHystixMonitorApplication.class, args);
    }
}
