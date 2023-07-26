package com.qfl.trading.service;

import com.qfl.trading.entity.OrderMap;
import com.qfl.trading.mapper.OrderMapMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMapService {
    @Autowired
    private OrderMapMap orderMapMap;
    public List<OrderMap> getOrderMap(String table){
        return orderMapMap.getOrderMap(table);
    }
}
