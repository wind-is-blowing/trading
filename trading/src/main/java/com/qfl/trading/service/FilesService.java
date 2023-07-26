package com.qfl.trading.service;

import com.qfl.trading.entity.Files;
import com.qfl.trading.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilesService {
    @Autowired
    private FileMapper fileMapper;

    public List<Files> getInfo(){
        return fileMapper.getInfo();
    }
}

