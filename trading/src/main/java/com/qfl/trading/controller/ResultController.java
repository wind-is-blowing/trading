package com.qfl.trading.controller;

import com.qfl.trading.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
    @Autowired
    private ResultService resultService;

    @GetMapping("/result")
    public void updateStatus(@RequestParam("key") int key,@RequestParam("sku_id") int sku_id,@RequestParam("o_id") int o_id,@RequestParam("status") int status){
        String table="fileID"+Integer.toString(key)+"_5";
        resultService.updateStatus(table,sku_id,o_id,status);
    }
}
