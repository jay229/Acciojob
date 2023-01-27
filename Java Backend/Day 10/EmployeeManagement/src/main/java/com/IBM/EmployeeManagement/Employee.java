package com.IBM.EmployeeManagement;

public class Employee {
    private int empNo;
    private String name;
    private int age;
    private String state;
    private long salary;

    public Employee(int empNo, String name, int age, String state, long salary) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.state = state;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
