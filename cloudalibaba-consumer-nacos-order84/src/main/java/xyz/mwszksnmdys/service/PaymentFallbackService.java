package xyz.mwszksnmdys.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import xyz.mwszksnmdys.entities.CommonResult;
import xyz.mwszksnmdys.entities.Payment;


@Service
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<Payment>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
