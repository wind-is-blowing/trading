package com.qfl.trading.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StringMapper {

    public String getDatabase(int key);
}
