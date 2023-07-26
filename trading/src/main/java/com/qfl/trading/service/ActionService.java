package com.qfl.trading.service;

import com.qfl.trading.entity.Action;
import com.qfl.trading.mapper.ActionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {
    @Autowired
    private ActionMapper actionMapper;
    public List<Action> getAction(String table){
        return actionMapper.getAction(table);
    }
}
