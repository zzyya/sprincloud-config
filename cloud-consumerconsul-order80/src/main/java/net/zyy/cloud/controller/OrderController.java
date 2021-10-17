package net.zyy.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String URL = "http://localhost:8006";
    @GetMapping("consumer/payment")
    public String getNum(){
       return restTemplate.getForObject(URL+"/payment/consul",String.class);
    }
}
