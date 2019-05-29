package com.inspur.dubbo.service.impl;

import com.inspur.dubbo.entity.OrderRequest;
import com.inspur.dubbo.entity.OrderResponse;
import com.inspur.dubbo.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * User: YANG
 * Date: 2019/5/27-22:16
 * Description: No Description
 */
@Service("orderService2")
public class OrderServiceImpl2 implements OrderService {
    @Override
    public OrderResponse doOrder(OrderRequest orderRequest) {
        System.out.println("version 0.0.1 请求OrderRequest is -------------->:" + orderRequest);
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setData("");
        orderResponse.setMemo("处理成功");
        orderResponse.setCode("1000");
        return orderResponse;
    }
}
