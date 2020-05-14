package com.example.serviceclient.login.entity;

import java.util.List;

/**
 * @ClassName Order
 * @Description TODO
 * @Author admin
 * @Date 2019/11/13 10:08
 * @Version 1.0
 **/
public class Order {


    private int orderNo;

    private String orderDescribe;

    private List<User> userList;

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
