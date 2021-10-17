package net.zyy.cloud.dao;

import net.zyy.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment findById(@Param("id") Long id);
}
