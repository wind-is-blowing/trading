package com.qfl.trading.mapper;

import com.qfl.trading.entity.Detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SpecificMapper {
    @Select("select * from ${table} where ${table}.label=0 and ${table}.o_id=${o_id}")
    public List<Detail> getSpecific(String table,int o_id);
}
