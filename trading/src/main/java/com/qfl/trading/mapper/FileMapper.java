package com.qfl.trading.mapper;

import com.qfl.trading.entity.Files;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FileMapper {

    @Select("select fileID,description from overview")
    public List<Files> getInfo();

}
