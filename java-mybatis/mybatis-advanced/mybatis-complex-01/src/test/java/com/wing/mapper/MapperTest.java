package com.wing.mapper;

import com.wing.pojo.Student;
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

    @Test
    public void getStudentList() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }

        // 关闭资源
        sqlSession.close();
    }

    @Test
    public void getStudentList2() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 执行
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList2();
        for (Student student : studentList) {
            System.out.println(student);
        }

        // 关闭资源
        sqlSession.close();
    }
}
