package com.wing.mapper;

import com.wing.mapper.UserMapper;
import com.wing.pojo.User;
import com.wing.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    // 模糊查询
    @Test
    public void getUserByLike() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserByLike("%J%");
        for (User user : userList) {
            System.out.println(user);
        }

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
    public void addUser2() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        // 执行
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("userId", 9);
        map.put("userName", "William");
        map.put("passWord", "666888");

        int result = userDao.addUser2(map);
        if (result > 0) {
            System.out.println("添加用户2 =======>成功！");
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
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
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
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
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
