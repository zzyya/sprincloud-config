package net.zyy.cloud.controller;

import net.zyy.cloud.entities.CommonResult;
import net.zyy.cloud.entities.Payment;
import net.zyy.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
@PostMapping("create")
    public CommonResult create(Payment payment){
        int rows = paymentService.create(payment);
        if (rows == 1){
            return new CommonResult(200,"插入成功8001",rows);
        }else {
            return new CommonResult(0,"插入失败8001",null);
        }
    }
@GetMapping("findById")
    public CommonResult findById( Long id){
        Payment payment = paymentService.findById(id);
        if (payment != null){
            return new CommonResult(200,"查询成功8001",payment);
        }else {
            return new CommonResult(0,"查询失败8001",null);
        }
    }
}
