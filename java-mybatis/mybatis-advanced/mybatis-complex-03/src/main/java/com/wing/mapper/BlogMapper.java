package com.wing.mapper;

import com.wing.pojo.Blog;

import java.util.List;

public interface BlogMapper {
    // 添加数据
    public int addBlog(Blog blog);

    // 获取数据
    public List<Blog> getBlogList();
}
