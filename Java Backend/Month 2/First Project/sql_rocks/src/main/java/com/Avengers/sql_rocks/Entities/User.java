package com.Avengers.sql_rocks.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {

    @Id
    @Column(unique = true)
    private int id;
    private String name;
    private String mobNo;
    @Column(unique = true)
    private String email;
    private String state;

    public String getState() {
        return state;
    }

    public User(int id, String name, String mobNo, String email, String state) {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
        this.email = email;
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setState(String state) {
        this.state = state;
    }


    public User(){

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

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
