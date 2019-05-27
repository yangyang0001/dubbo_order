package com.inspur.dubbo.service;

import com.inspur.dubbo.entity.OrderRequest;
import com.inspur.dubbo.entity.OrderResponse;

/**
 * User: YANG
 * Date: 2019/5/26-22:44
 * Description: No Description
 */
public interface OrderService {

    //下单操作
    public OrderResponse doOrder(OrderRequest orderRequest);

}
