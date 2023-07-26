package com.qfl.trading.service;

import com.qfl.trading.entity.Detail;
import com.qfl.trading.mapper.DetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {
    @Autowired
    private DetailMapper detailMapper;
    public List<Detail> getDetail(String table){
        return detailMapper.getDetail(table);
    }
}
