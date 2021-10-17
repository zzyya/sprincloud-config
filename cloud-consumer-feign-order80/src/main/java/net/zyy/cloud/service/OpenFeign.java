package net.zyy.cloud.service;

import net.zyy.cloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OpenFeign {
    @GetMapping("payment/findById/")
    CommonResult finById(Long id);
}
