package net.zyy.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "wuwuwuwuw";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "wuuwuwuwuw";
    }
}
