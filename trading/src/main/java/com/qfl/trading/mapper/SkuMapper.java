package com.qfl.trading.mapper;

import com.qfl.trading.entity.Action;
import com.qfl.trading.entity.Sku;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface SkuMapper {
    @Select("select * from ${table}")
    public List<Sku> getSku(String table);
}
