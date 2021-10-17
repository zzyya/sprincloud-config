package net.zyy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class HyApplication {
    public static void main(String[] args) {
        SpringApplication.run(HyApplication.class,args);
    }
}
