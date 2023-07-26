package com.qfl.trading.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ResultMapper {
    @Update("update ${table} set status=#{status} where sku_id=#{sku_id} and o_id=#{o_id}")
    public void updateStatus(String table,int sku_id,int o_id,int status);
}
