package net.zyy.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "http://localhost:8001")
public interface Service {
    @GetMapping("/payment/hystrix/timeout")
    String paymentInfo_TimeOut(Integer id);
    @GetMapping("/payment/hystrix/ok")
    String paymentInfo_OK(Integer id);
}
