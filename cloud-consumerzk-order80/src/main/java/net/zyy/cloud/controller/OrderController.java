package net.zyy.cloud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

        private static final String INVOME_URL = "http://localhost:8004";

        @Autowired
        private RestTemplate restTemplate;
        @GetMapping("/consumer/payment/zk")
        public String payment (){
            return restTemplate.getForObject(INVOME_URL+"/payment/zookeeper",String.class);

        }


    }

