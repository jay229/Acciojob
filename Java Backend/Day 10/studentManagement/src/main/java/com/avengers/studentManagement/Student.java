package com.avengers.studentManagement;

public class Student {
    private String name;
    private int admNo;
    private int age;
    private String state;

    public Student(String name, int admNo, int age, String state) {
        this.name = name;
        this.admNo = admNo;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
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
}
