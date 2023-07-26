package com.qfl.trading.mapper;

import com.qfl.trading.entity.Action;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ActionMapper {
    @Select("select * from ${table}")
    public List<Action> getAction(String table);
}
