package com.example.serviceclient.login.entity;

/**
 * @ClassName User
 * @Description TODO
 * @Author admin
 * @Date 2019/11/13 10:08
 * @Version 1.0
 **/
public class User {


    private int userId;

    private String userName;

    private char userSex;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public void setUserSex(char userSex) {
        this.userSex = userSex;
    }
}
