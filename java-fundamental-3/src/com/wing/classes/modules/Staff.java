package com.wing.classes.modules;

import com.wing.classes.parents.Person;
/**
 * @author memory125
 */
public class Staff extends Person {
    // 公司
    String company;
    // 薪水
    double salary;

    public Staff() {
        super();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getClass() + "\t" + this.getName() + "\t"
                + Integer.toString(this.getAge()) + "\t"
                + this.getGender() + "\t"
                + this.getCompany() + "\t"
                + Double.toString(this.getSalary()) + "\t"
                + this.getAddr();
    }
}
