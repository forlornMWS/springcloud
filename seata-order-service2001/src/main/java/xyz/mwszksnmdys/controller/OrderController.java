package xyz.mwszksnmdys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.mwszksnmdys.domain.CommonResult;
import xyz.mwszksnmdys.domain.Order;
import xyz.mwszksnmdys.service.OrderService;
import xyz.mwszksnmdys.service.impl.OrderServiceImpl;

import javax.annotation.Resource;

@RestController
public class OrderController{
    @Resource
    private OrderServiceImpl orderServiceImpl;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderServiceImpl.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
