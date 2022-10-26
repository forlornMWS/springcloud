package xyz.mwszksnmdys.service.impl;

import org.springframework.stereotype.Service;
import xyz.mwszksnmdys.dao.OrderDao;
import xyz.mwszksnmdys.domain.Order;
import xyz.mwszksnmdys.service.AccountService;
import xyz.mwszksnmdys.service.OrderService;
import xyz.mwszksnmdys.service.StorageService;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    public void create(Order order) {
        // 新建订单
        orderDao.create(order);
        // 扣减库存
        storageService.decrease(order.getProductId(), order.getCount());
        // 修改账户余额
        accountService.decrease(order.getUserId(), order.getMoney());
        // 修改订单状态
        orderDao.update(order.getUserId(), 0);
    }
}
