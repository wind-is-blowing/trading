package com.qfl.trading.mapper;

import com.qfl.trading.entity.Action;
import com.qfl.trading.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    @Select("select * from ${table}")
    public List<Order> getOrder(String table);
}
