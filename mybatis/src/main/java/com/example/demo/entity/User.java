package com.example.demo.entity;

import java.util.Date;

public class User {

    //主键ID
    private Integer id;

    //用户名
    private String userName;

    //用户昵称
    private String nickName;

    //年龄
    private Integer age;

    //性别
    private Integer sex;

    //密码
    private String password;

    //创建时间
    private Date createTime;

    public User(){
        super();
    }

    public User(Integer id, String userName, String nickName, Integer age, Integer sex, String password, Date createTime) {
        this.id = id;
        this.userName = userName;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
        this.password = password;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
