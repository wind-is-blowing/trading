package com.qfl.trading.service;

import com.qfl.trading.mapper.DataSizeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSizeService {
    @Autowired
    private DataSizeMapper dataSizeMapper;
    public int getDataSize(String table){
        return dataSizeMapper.getDataSize(table);
    }
}
