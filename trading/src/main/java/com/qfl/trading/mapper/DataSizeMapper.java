package com.qfl.trading.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
public interface DataSizeMapper {
    @Select("select count(*) from ${table}")
    public int getDataSize(String table);
}
