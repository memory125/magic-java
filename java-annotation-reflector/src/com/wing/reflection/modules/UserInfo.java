package com.wing.reflection.modules;

import com.wing.annotation.selfdefined.MyTable;
import com.wing.annotation.selfdefined.MyTableField;

/**
 * @author memory125
 */
@MyTable("db_user")
public class UserInfo {
    @MyTableField(column = "id", type = "int", length = 8)
    private int id;
    @MyTableField(column = "name", type = "varchar", length = 20)
    private String name;
    @MyTableField(column = "age", type = "int", length = 8)
    private int age;
    @MyTableField(column = "gender", type = "varchar", length = 10)
    private String gender;

    public UserInfo() {
    }

    public UserInfo(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
