package com.qfl.trading.service;

import com.qfl.trading.entity.Detail;
import com.qfl.trading.mapper.SpecificMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificService {
    @Autowired
    private SpecificMapper specificMapper;

    public List<Detail> getSpecific(String table,int o_id){
        return specificMapper.getSpecific(table,o_id);
    }
}
