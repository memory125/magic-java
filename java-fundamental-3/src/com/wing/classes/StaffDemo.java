package com.wing.classes;

import com.wing.classes.modules.Staff;

public class StaffDemo {
    public static void main(String[] args) {
        // staff 1
        Staff staff1 = new Staff();
        staff1.setName("Jacky");
        staff1.setAge(33);
        staff1.setGender("Male");
        staff1.setAddr("Shenzhen,Guangdong,China");
        staff1.setCompany("Tencent");
        staff1.setSalary(50000);

        // staff 2
        Staff staff2 = new Staff();
        staff2.setName("Jane");
        staff2.setAge(32);
        staff2.setGender("Female");
        staff2.setCompany("Huawei");
        staff2.setSalary(45000);
        staff2.setAddr("Xian,Shanxi,China");

        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
    }
}
