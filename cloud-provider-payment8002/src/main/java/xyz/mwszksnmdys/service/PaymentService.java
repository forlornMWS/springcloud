package xyz.mwszksnmdys.service;

import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.entities.Payment;

public interface PaymentService {
    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
