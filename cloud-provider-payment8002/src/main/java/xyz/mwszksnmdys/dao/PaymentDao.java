package xyz.mwszksnmdys.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.mwszksnmdys.entities.Payment;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
