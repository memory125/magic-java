package com.wing.mapper;

import com.wing.pojo.Blog;
import com.wing.utils.IDUtils;
import com.wing.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MapperTest {

    @Test
    public void addBlog() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.generateID());
        blog.setTitle("Mybatis课程");
        blog.setAuthor("David");
        blog.setCreateTime(new Date());
        mapper.addBlog(blog);

        blog.setId(IDUtils.generateID());
        blog.setTitle("Spring课程");
        blog.setAuthor("Jack");
        mapper.addBlog(blog);


        blog.setId(IDUtils.generateID());
        blog.setTitle("SpringMVC课程");
        blog.setAuthor("Tina");
        mapper.addBlog(blog);

        blog.setId(IDUtils.generateID());
        blog.setTitle("Spring Cloud课程");
        blog.setAuthor("Tom");
        mapper.addBlog(blog);

        // 提交事务
        sqlSession.commit();

        // 关闭连接
        sqlSession.close();
    }

    @Test
    public void getTeacherList() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList = mapper.getBlogList();
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        // 关闭资源
        sqlSession.close();
    }

}
