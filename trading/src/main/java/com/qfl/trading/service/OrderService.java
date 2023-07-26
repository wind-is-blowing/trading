package com.qfl.trading.service;

import com.qfl.trading.entity.Order;
import com.qfl.trading.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
    public List<Order> getOrder(String table){
        return orderMapper.getOrder(table);
    }
}
