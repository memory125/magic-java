package com.wing.mapper;

import com.wing.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 添加数据
    public int addBlog(Blog blog);

    // 获取数据
    public List<Blog> getBlogList();

    // 按照条件查询
    public List<Blog> queryBlogByIf(Map<String, Object> map);

    // 按照条件查询
    public List<Blog> queryBlogByChoose(Map map);

    // 更新数据
    public int updateBlog(Map map);

}
