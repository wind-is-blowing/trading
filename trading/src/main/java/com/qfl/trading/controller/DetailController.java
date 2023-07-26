package com.qfl.trading.controller;

import com.qfl.trading.entity.Detail;
import com.qfl.trading.entity.Files;
import com.qfl.trading.service.DetailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DetailController {
    @Autowired
    private DetailService detailService;

//    //返回所有异常数据
//    @GetMapping("/examine")
//    public List<Detail> getSpecific(@RequestParam("key") int key){
//        String table="fileID"+Integer.toString(key)+"_5";
//        List<Detail> listAll=detailService.getDetail(table);
//        List<Detail>list;
//        List<Map<String,Object>>l = new ArrayList<Map<String,Object>>();
//        for(int i=0;i<listAll.size();i++){
//            var t=listAll.get(i);
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("user_id", t.getUser_id());
//            map.put("new_user_id", t.getNew_user_id());
//            map.put("sku_id", t.getSku_id());
//            map.put("o_id", t.getO_id());
//            map.put("date", t.getDate());
//            map.put("area", t.getArea());
//            map.put("num", t.getNum());
//            map.put("price", t.getPrice());
//            map.put("cate", t.getCate());
//            map.put("k1", t.getK1());
//            map.put("k2", t.getK2());
//            map.put("k3", t.getK3());
//            map.put("k4", t.getK4());
//            map.put("J1", t.getJ1());
//            map.put("J2", t.getJ2());
//            map.put("J3", t.getJ3());
//            map.put("J5", t.getJ5());
//            map.put("J6", t.getJ6());
//            map.put("J7", t.getJ7());
//            map.put("Y2", t.getY2());
//            map.put("Y3", t.getY3());
//            map.put("S1", t.getS1());
//            map.put("S3", t.getS3());
//            map.put("label", t.getLabel());
//            map.put("state", t.getState());
//            l.add(map);
//        }
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i).toString());
//        }
//        System.out.println(listAll);
//
//        return listAll;
//
//    }
    //返回某页异常数据，默认一页12行
    @GetMapping("/examine")
    public Map<String,Object> getPart(@RequestParam("key")int key, @RequestParam("current") int page){
        String table="fileID"+Integer.toString(key)+"_5";
        List<Detail> listAll=detailService.getDetail(table);
        System.out.println(listAll);
        List<Detail> listPart=new ArrayList<>();
        int total=listAll.size(); //异常数据总行数
        int current=page;
        int start=(current-1)*12;
        int end=start+12;
        for(int i=start;i<end&&i<total;i++){
            listPart.add(listAll.get(i));
        }
        List<Detail>list;
        List<Map<String,Object>>l = new ArrayList<Map<String,Object>>();
        for(int i=0;i<listPart.size();i++){
            var t=listPart.get(i);
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
            map.put("userName", t.getUserName());
            map.put("areaName", t.getAreaName());
            map.put("cateName", t.getCateName());
            map.put("payType", t.getPayType());
            l.add(map);
        }
        Map<String,Object>re=new HashMap();
        re.put("data",l);
        re.put("current",current);
        re.put("total",total);
        return re;

    }

}
