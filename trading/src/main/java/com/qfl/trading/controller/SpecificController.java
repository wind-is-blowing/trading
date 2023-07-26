package com.qfl.trading.controller;

import com.qfl.trading.entity.Detail;
import com.qfl.trading.service.SpecificService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SpecificController {
    @Autowired
    private SpecificService specificService;
    @GetMapping("/details")
    public List<Map<String,Object>> getSpecific(@RequestParam("key") int key,@RequestParam("o_id") int o_id){
        String table="fileID"+Integer.toString(key)+"_5";
        List<Detail> list=specificService.getSpecific(table,o_id);
        List<Map<String,Object>>l=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            var t=list.get(i);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("user_id", t.getUser_id());
            map.put("new_user_id", t.getNew_user_id());
            map.put("sku_id", t.getSku_id());
            map.put("o_id", t.getO_id());
            map.put("date", t.getDate());
            map.put("area", t.getArea());
            map.put("num", t.getNum());
            map.put("price", t.getPrice());
            map.put("cate", t.getCate());
            map.put("k1", t.getK1());
            map.put("k2", t.getK2());
            map.put("k3", t.getK3());
            map.put("k4", t.getK4());
            map.put("J1", t.getJ1());
            map.put("J2", t.getJ2());
            map.put("J3", t.getJ3());
            map.put("J5", t.getJ5());
            map.put("J6", t.getJ6());
            map.put("J7", t.getJ7());
            map.put("Y2", t.getY2());
            map.put("Y3", t.getY3());
            map.put("S1", t.getS1());
            map.put("S3", t.getS3());
            map.put("label", t.getLabel());
            map.put("status", t.getStatus());
            l.add(map);
        }
        return l;
    }
}
