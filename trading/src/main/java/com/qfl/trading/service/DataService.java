package com.qfl.trading.service;

import com.qfl.trading.entity.Data;
import com.qfl.trading.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    private DataMapper dataMapper;

    public List<Data> getData(String table){
        return dataMapper.getData(table);
    }
}
