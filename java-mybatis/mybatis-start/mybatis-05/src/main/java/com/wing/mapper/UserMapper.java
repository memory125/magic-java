package com.wing.mapper;

import com.wing.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author memory125
 */
public interface UserMapper {
    // 获取所有用户
    @Select("select * from user")
    List<User> getUserList();

    // 根据用户ID查询
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

      // 添加用户
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);

    // 修改用户

    @Update("update user set name = #{name}, pwd = #{pwd} where id = #{id}")
    int updateUser(User user);

    // 删除用户
    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
