package com.inspur.dubbo.service.impl;

import com.inspur.dubbo.service.OrderQueryService;
import org.springframework.stereotype.Service;

/**
 * User: YANG
 * Date: 2019/5/27-19:30
 * Description: No Description
 * Service 是spring中的Service的注解
 */
@Service(value="orderQueryService")
public class OrderQueryServiceImpl implements OrderQueryService {
    @Override
    public String doQuery(String orderName) {
        System.out.println("doQuery ---------->" + orderName);
        return "Hello " + orderName;
    }
}
