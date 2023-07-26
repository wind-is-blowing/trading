package com.qfl.trading.mapper;

import com.qfl.trading.entity.Action;
import com.qfl.trading.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    @Select("select * from ${table}")
    public List<Comment> getComment(String table);
}
