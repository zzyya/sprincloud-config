package net.zyy.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class Hcontroller {

    @GetMapping("/payment/hystrix/ok")
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;

    }
    @HystrixCommand(fallbackMethod = "getMsg(Integer id)",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    @GetMapping("/payment/hystrix/timeout")
    public String paymentInfo_TimeOut(Integer id) {
        if (id > 10){
            throw new RuntimeException("不能大于10");}
        String a = UUID.randomUUID().toString();
        return a;
   }

    public String getMsg(Integer id){
        return "呜呜呜";
    }
}

