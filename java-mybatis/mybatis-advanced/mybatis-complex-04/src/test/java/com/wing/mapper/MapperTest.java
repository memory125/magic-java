package com.wing.mapper;

import com.wing.pojo.User;
import com.wing.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author memory125
 */
public class MapperTest {
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

    @Test
    public void queryUserById() {
// 获取sqlSession对象
        SqlSession sqlSession1 = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();

        // 执行
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);

        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);
        // 关闭资源
        sqlSession1.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);

        System.out.println("User1 == User2: " + (user1 == user2));

        // 关闭资源
        sqlSession2.close();
    }
}
