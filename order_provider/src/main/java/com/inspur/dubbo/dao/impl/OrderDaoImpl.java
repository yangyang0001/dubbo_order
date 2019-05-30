package com.inspur.dubbo.dao.impl;

import com.inspur.dubbo.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * User: YANG
 * Date: 2019/5/29-14:16
 * Description: No Description
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate orderJdbcTemplate;

    @Override
    public void insertOrder() {
        orderJdbcTemplate.execute("INSERT `order`(`order_name`,`order_price`,`order_time`) VALUES('订单001',22.5,NOW())");
    }
}
