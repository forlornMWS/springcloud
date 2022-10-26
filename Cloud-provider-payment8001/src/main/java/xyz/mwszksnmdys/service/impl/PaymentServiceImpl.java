package xyz.mwszksnmdys.service.impl;

import org.springframework.stereotype.Service;
import xyz.mwszksnmdys.dao.PaymentDao;
import xyz.mwszksnmdys.entities.Payment;
import xyz.mwszksnmdys.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
