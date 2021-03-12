package com.wing.mapper;

import com.wing.pojo.Teacher;
import com.wing.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MapperTest {
    @Test
    public void getTeacherList() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacherList();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        // 关闭资源
        sqlSession.close();
    }
}
