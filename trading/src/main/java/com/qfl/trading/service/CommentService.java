package com.qfl.trading.service;

import com.qfl.trading.entity.Comment;
import com.qfl.trading.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;
    public List<Comment> getComment(String table){
        return commentMapper.getComment(table);
    }
}
