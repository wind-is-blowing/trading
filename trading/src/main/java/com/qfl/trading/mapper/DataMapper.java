package com.qfl.trading.mapper;

import com.qfl.trading.entity.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DataMapper {
    @Select("select user_id,sku_id,price,date,cate,label,userName,areaName,cateName,payType from ${table} order by date")
    public List<Data> getData(String table);
}
