package com.qfl.trading.mapper;

import com.qfl.trading.entity.Detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DetailMapper {

    @Select("select * from ${table} where ${table}.label=1")
    public List<Detail> getDetail(String table);

}
