package com.qfl.trading.controller;

import com.qfl.trading.entity.Files;
import com.qfl.trading.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FilesController {

    @Autowired
    private FilesService filesService;

    @RequestMapping("/getAllData")   //这里根据链接调整
    public List<Map<String,Object>> getFilesInfo(){
        List<Files>list;
        list=filesService.getInfo();
        List<Map<String,Object>>l = new ArrayList<Map<String,Object>>();
        for(int i=0;i<list.size();i++){
            var t=list.get(i);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fileID", t.getFileID());
            map.put("description", t.getDescription());
            l.add(map);
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i).toString());
        }
        return l;
    }
}
