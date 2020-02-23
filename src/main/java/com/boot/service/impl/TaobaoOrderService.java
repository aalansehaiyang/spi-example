package com.boot.service.impl;

import com.boot.param.AddOrderParam;
import com.boot.service.OrderService;

/**
 * 淘宝的处理逻辑
 * 
 * @author onlyone
 */
public class TaobaoOrderService implements OrderService {

    @Override
    public String createOrder(AddOrderParam addOrderParam) {
        return "淘宝创建订单成功";
    }
}
