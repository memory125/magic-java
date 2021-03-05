package com.wing.dao;

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
        UserDao userDao = sqlSession.getMapper(UserDao.class);
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
        UserDao userDao = sqlSession.getMapper(UserDao.class);
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
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result = userDao.addUser(new User(8, "Clark", "555666"));
        if (result > 0) {
            System.out.println("添加用户成功！");
        }

        // 必须要提交事务
        sqlSession.commit();

        // 关闭资源
        sqlSession.close();
    }

    // 增删改需要提交事务
    @Test
    public void updateUser() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 执行
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result = userDao.updateUser(new User(8, "Celina", "222333"));
        if (result > 0) {
            System.out.println("修改用户成功！");
        }

        // 必须要提交事务
        sqlSession.commit();

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 执行
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result = userDao.deleteUser(8);
        if (result > 0) {
            System.out.println("删除用户成功！");
        }
        // 必须要提交事务
        sqlSession.commit();

        // 关闭资源
        sqlSession.close();
    }
}
