package com.qfl.trading.controller;

import com.qfl.trading.entity.DataSize;
import com.qfl.trading.service.DataSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DataSizeController{
    @Autowired
    private DataSizeService dataSizeService;
    @GetMapping("/dataSize")
    public Map<String,Object> getDataSize(@RequestParam("key") int key){
        String s="_"+"fileID"+Integer.toString(key);
        int actionSize= dataSizeService.getDataSize("action"+s);
        int commentSize= dataSizeService.getDataSize("comment"+s);
        int orderSize= dataSizeService.getDataSize("order"+s);
        int skuSize= dataSizeService.getDataSize("sku"+s);
        Map<String,Object>m=new HashMap<>();
        m.put("action",actionSize);
        m.put("sku",skuSize);
        m.put("order",orderSize);
        m.put("comment",commentSize);
        return m;
    }
}
