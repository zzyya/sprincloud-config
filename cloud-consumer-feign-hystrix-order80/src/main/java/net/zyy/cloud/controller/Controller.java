package net.zyy.cloud.controller;

import net.zyy.cloud.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Service service;
    @GetMapping("/consumer/hystrix/timeout")
     public String paymentInfo_TimeOut(Integer id){
       return service.paymentInfo_TimeOut(id);
    }
    @GetMapping("/consumer/hystrix/ok")
     public String paymentInfo_OK(Integer id){
       return service.paymentInfo_OK(id);
    }
}
