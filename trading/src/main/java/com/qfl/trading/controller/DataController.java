package com.qfl.trading.controller;

import com.qfl.trading.entity.Data;
import com.qfl.trading.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/monitor")
    public List<Data> getData(@RequestParam("key") int paramValue){
        String s="fileID";
        String table=s+Integer.toString(paramValue)+"_5";
        System.out.println(table);
        List<Data> list=dataService.getData(table);
        System.out.println(list);
        return list;
    }
}
