package com.wing.mapper;

import com.wing.pojo.Blog;
import com.wing.pojo.User;
import com.wing.utils.IDUtils;
import com.wing.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

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
    public void getBlogs() {
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

    @Test
    public void getBlogListByIf() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("author", "David");
        map.put("title", "Spring课程");
        List<Blog> blogList = mapper.queryBlogByIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void getBlogsByChoose() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        //map.put("author", "David");
        //map.put("title", "Spring课程");
        map.put("views", 2000);
        List<Blog> blogList = mapper.queryBlogByChoose(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title", "Spring课程");
        //map.put("author", "David");
        //map.put("views", 2000);
        map.put("id", "bc590ad03a694db788e50bd370784a46");
        mapper.updateBlog(map);

        // 提交事务
        sqlSession.commit();

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void getUserByForeach() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        map.put("ids", ids);

        List<User> users = mapper.queryUserByForeach(map);
        for (User user : users) {
            System.out.println(user);
        }

        // 关闭资源
        sqlSession.close();
    }
}
