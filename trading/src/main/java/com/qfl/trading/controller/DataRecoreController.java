package com.qfl.trading.controller;

import com.qfl.trading.entity.Action;
import com.qfl.trading.entity.Comment;
import com.qfl.trading.entity.Order;
import com.qfl.trading.entity.Sku;
import com.qfl.trading.service.ActionService;
import com.qfl.trading.service.CommentService;
import com.qfl.trading.service.OrderService;
import com.qfl.trading.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DataRecoreController {
    @Autowired
    private ActionService actionService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private SkuService skuService;

    @GetMapping("/dataRecore")
    public List<Map<String,Object>> getDataRecore(@RequestParam("key") int key,@RequestParam("tableName") String tableName,@RequestParam("current") int current){
        List<Map<String,Object>>list=new ArrayList<>();
        String table=tableName+"_"+"fileID"+Integer.toString(key);
        int start=(current-1)*12;
        int end=start+12;
        if(tableName.equals("action")){
            List<Action>ls=actionService.getAction(table);
            for(int i=start;i<end&&i<ls.size();i++){
                var t=ls.get(i);
                Map<String,Object>m=new HashMap<>();
                m.put("user_id",t.getUser_id());
                m.put("sku_id",t.getSku_id());
                m.put("date",t.getDate());
                m.put("num",t.getNum());
                list.add(m);
            }
            return list;
        }
        else if(tableName.equals("comment")){
            List<Comment>ls=commentService.getComment(table);
            for(int i=0;i<ls.size();i++){
                var t=ls.get(i);
                Map<String,Object>m=new HashMap<>();
                m.put("user_id",t.getUser_id());
                m.put("o_id",t.getO_id());
                m.put("score",t.getScore());
                list.add(m);
            }
            return list;
        }
        else if(tableName.equals("order")){
            List<Order>ls=orderService.getOrder(table);
            for(int i=0;i<ls.size();i++){
                var t=ls.get(i);
                Map<String,Object>m=new HashMap<>();
                m.put("user_id",t.getUser_id());
                m.put("sku_id",t.getSku_id());
                m.put("o_id",t.getO_id());
                m.put("date",t.getDate());
                m.put("area",t.getArea());
                m.put("num",t.getNum());
                m.put("label",t.getLabel());
                list.add(m);
            }
            return list;
        }
        else if(tableName.equals("sku")){
            List<Sku>ls=skuService.getSku(table);
            for(int i=0;i<ls.size();i++){
                var t=ls.get(i);
                Map<String,Object>m=new HashMap<>();
                m.put("sku_id",t.getSku_id());
                m.put("price",t.getPrice());
                m.put("cate",t.getCate());
                list.add(m);
            }
            return list;
        }
        else return null;
    }
}
