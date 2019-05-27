package com.inspur.dubbo.service.impl;

import com.inspur.dubbo.entity.OrderRequest;
import com.inspur.dubbo.entity.OrderResponse;
import com.inspur.dubbo.service.OrderService;

/**
 * User: YANG
 * Date: 2019/5/26-23:00
 * Description: No Description
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderResponse doOrder(OrderRequest orderRequest) {
        System.out.println("请求OrderRequest is -------------->:" + orderRequest);
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setData("");
        orderResponse.setMemo("处理成功");
        orderResponse.setCode("1000");
        return orderResponse;
    }
}
