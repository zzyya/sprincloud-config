package net.zyy.cloud.controller;
import net.zyy.cloud.entities.CommonResult;
import net.zyy.cloud.entities.Payment;
import net.zyy.cloud.lb.LoadBanlanceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class OrderController {

//    @Autowired
//    private LoadBanlanceImpl loadBanlance;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;
    private static final String PAYMENT_URL = "http://localhost:8001";
    //@GetMapping("consumer/payment/create")

    @GetMapping("consumer/findById")
    public CommonResult findById( Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/findById?id="+id,CommonResult.class);
    }
//    @GetMapping("/consumer/lb")
//    public String getPayment(){
//        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
//        if (serviceInstanceList == null){
//            return null;
//        }
//        ServiceInstance serviceInstance = loadBanlance.serviceInstance(serviceInstanceList);
//        URI uri = serviceInstance.getUri();
//        return restTemplate.getForObject(uri+"/payment/findById",String.class);
//    }
}
