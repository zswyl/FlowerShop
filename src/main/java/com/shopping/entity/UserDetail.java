package com.shopping.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="user_detail")
public class UserDetail {
    @Id
    @GenericGenerator(name = "generator", strategy = "assigned")
    @GeneratedValue(generator = "generator")

    @Column(name="id")
    private int id;
    @Column(name="password")
    private String password;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="sex")
    private int sex;
    @Column(name="birthday")
    private String birthday;
    @Column(name="post_number")
    private String postNumber;
    @Column(name="address")
    private String address;
    @Column(name="register_time")
    private String registerTime;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getPostNumber() {
        return postNumber;
    }
    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRegisterTime() {
        return registerTime;
    }
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }
}
