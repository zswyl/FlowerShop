package com.shopping.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="user_main")
public class User {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment") //设置主键自增
    @GeneratedValue(generator = "generator")

    @Column(name="id")
    private int id;//用户ID
    @Column(name="name")
    private String name;//用户名
    @Column(name="email")
    private String email;
    @Column(name="nick_name")
    private String nickName;//昵称
    @Column(name="role")
    private int role;//权限


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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }
}
