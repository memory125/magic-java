package com.wing.mapper;

import com.wing.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;

import java.util.List;

public interface TeacherMapper {
    // 获取所有老师信息
    public List<Teacher> getTeacherList();

    // 获取指定的老师信息
    public Teacher getTeacher(int tid);

    // 获取指定的老师信息2
    public Teacher getTeacher2(int tid);
}
