package com.boot.service;

import com.boot.param.AddOrderParam;

/**
 * 创建订单接口
 * 
 * @author onlyone
 */
public interface OrderService {

    String createOrder(AddOrderParam addOrderParam);
}
