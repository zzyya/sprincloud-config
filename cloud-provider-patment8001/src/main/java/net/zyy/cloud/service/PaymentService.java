package net.zyy.cloud.service;

import net.zyy.cloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment findById(Long id);
}
