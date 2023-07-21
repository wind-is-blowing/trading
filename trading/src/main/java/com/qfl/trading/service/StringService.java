package com.qfl.trading.service;

import com.qfl.trading.mapper.StringMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringService {
    @Autowired
    private StringMapper stringMapper;

    public String getDatabase(int key){
        return stringMapper.getDatabase(key);
    }
}
