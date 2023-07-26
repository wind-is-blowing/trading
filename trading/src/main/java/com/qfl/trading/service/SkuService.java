package com.qfl.trading.service;

import com.qfl.trading.entity.Sku;
import com.qfl.trading.mapper.SkuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkuService {
    @Autowired
    private SkuMapper skuMapper;
    public List<Sku> getSku(String table){
        return skuMapper.getSku(table);
    }
}
