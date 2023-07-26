package com.qfl.trading.controller;

import com.qfl.trading.entity.OrderMap;
import com.qfl.trading.service.OrderMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderMapController {
    @Autowired
    private OrderMapService orderMapService;

    @GetMapping("/orderMap")
    public Map<String,Object> getOrderMap(@RequestParam("key") int key){
        String table="fileID"+Integer.toString(key)+"_5";
        List<OrderMap>list=orderMapService.getOrderMap(table);
        System.out.println(list);
        Map<String,Object>m=new HashMap<>();
        for(int i=0;i<list.size();i++){
            var t=list.get(i);
            m.put(t.getAreaName(),t.getCount());
        }
        return m;
    }
}
