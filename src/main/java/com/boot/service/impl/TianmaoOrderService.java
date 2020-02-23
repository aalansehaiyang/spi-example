package com.boot.service.impl;

import com.boot.param.AddOrderParam;
import com.boot.service.OrderService;

/**
 * 天猫的处理逻辑
 * 
 * @author onlyone
 */
public class TianmaoOrderService implements OrderService {

    @Override
    public String createOrder(AddOrderParam addOrderParam) {
        return "天猫创建订单成功";
    }
}
