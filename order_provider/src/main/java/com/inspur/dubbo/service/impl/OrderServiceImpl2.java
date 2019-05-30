package com.inspur.dubbo.service.impl;

import com.inspur.dubbo.dao.OrderDao;
import com.inspur.dubbo.entity.OrderRequest;
import com.inspur.dubbo.entity.OrderResponse;
import com.inspur.dubbo.service.OrderService;
import com.inspur.dubbo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.UserTransaction;

/**
 * User: YANG
 * Date: 2019/5/27-22:16
 * Description: No Description
 */
@Service("orderService2")
public class OrderServiceImpl2 implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private UserService userService;

    @Autowired
    private JtaTransactionManager jtaTransactionManager;

    @Override
    public OrderResponse doOrder(OrderRequest orderRequest) {
        System.out.println("version 0.0.1 请求OrderRequest is -------------->:" + orderRequest);

        UserTransaction userTransaction = jtaTransactionManager.getUserTransaction();
        try {
            userTransaction.begin();
            orderDao.insertOrder();
            userService.insertUser();
            userTransaction.commit();
        } catch (Exception ex){
            try {
                userTransaction.rollback();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setData("");
        orderResponse.setMemo("处理成功");
        orderResponse.setCode("1000");

        return orderResponse;
    }
}
