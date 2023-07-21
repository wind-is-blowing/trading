package com.qfl.trading.controller;

import com.qfl.trading.service.StringService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @Autowired
    private StringService stringService;

    @GetMapping("/run3")
    public void getDatabase(@RequestParam("key") int paramValue){
        String database=stringService.getDatabase(paramValue);

    }
}
