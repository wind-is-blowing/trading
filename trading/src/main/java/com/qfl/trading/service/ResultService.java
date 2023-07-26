package com.qfl.trading.service;

import com.qfl.trading.controller.ResultController;
import com.qfl.trading.mapper.ResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
    @Autowired
    private ResultMapper resultMapper;
    public void updateStatus(String table,int sku_id,int o_id,int status){resultMapper.updateStatus(table, sku_id, o_id, status);};
}
