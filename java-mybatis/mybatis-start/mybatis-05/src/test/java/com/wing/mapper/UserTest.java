package com.wing.mapper;

import com.wing.pojo.User;
import com.wing.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author memory125
 */
public class UserTest {

    @Test
    public void getUsers() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(5);
        System.out.println(user);

        // 关闭资源
        sqlSession.close();
    }


    // 增删改需要提交事务
    @Test
    public void addUser() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int result = userDao.addUser(new User(11, "Michael", "999888"));
        if (result > 0) {
            System.out.println("添加用户成功！");
        }

        // 关闭资源
        sqlSession.close();
    }

    // 增删改需要提交事务
    @Test
    public void updateUser() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int result = userDao.updateUser(new User(10, "Linda", "666555"));
        if (result > 0) {
            System.out.println("修改用户成功！");
        }

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int result = userDao.deleteUser(11);
        if (result > 0) {
            System.out.println("删除用户成功！");
        }

        // 关闭资源
        sqlSession.close();
    }
}
