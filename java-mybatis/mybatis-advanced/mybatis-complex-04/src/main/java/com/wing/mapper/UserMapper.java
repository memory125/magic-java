package com.wing.mapper;

import com.wing.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author memory125
 */
public interface UserMapper {
    // 获取所有用户
    List<User> getUserList();

    // 根据用户ID查询
    User getUserById(int id);

    // 按照名字模糊查询
    List<User> getUserByLike(String name);

    // 根据传入参数动态查询用户
    List<User> queryUserByForeach(Map map);

    // 根据传入参数动态查询用户
    User queryUserById(@Param("id") int id);

    // 添加用户
    int addUser(User user);

    // 添加用户
    int addUser2(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
