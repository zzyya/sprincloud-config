package net.zyy.cloud.controller;

import net.zyy.cloud.entities.CommonResult;
import net.zyy.cloud.service.OpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenfeignController {
    @Autowired
    private OpenFeign openFeign;
    @GetMapping(value = "/consumer/findById")
    public CommonResult getPaymentById(Long id){
        return openFeign.finById(id);
    }
}
