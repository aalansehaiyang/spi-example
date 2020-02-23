package com.boot;

import com.boot.service.OrderService;

import java.util.ServiceLoader;

/**
 * @author onlyone
 */
public class OrderTest {

    public static void main(String[] args) {
        ServiceLoader<OrderService> carServiceLoader = ServiceLoader.load(OrderService.class);
        carServiceLoader.forEach(order -> System.out.println(order.createOrder(null)));
    }
}
