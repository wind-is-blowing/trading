package com.qfl.trading.mapper;

import com.qfl.trading.entity.OrderMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapMap {
    @Select("select areaName,count(*) as count from ${table} group by areaName")
    public List<OrderMap> getOrderMap(String table);
}
