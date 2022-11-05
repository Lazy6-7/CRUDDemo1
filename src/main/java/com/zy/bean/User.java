package com.zy.bean;

/**
 * @Description:
 * @Title: User
 * @Package com.zy.bean
 * @Author: xiaozhang
 * @Copyright 版权归xiaozhang所有
 * @CreateTime: 2022/10/27 14:10
 */
public class User {
    private int id;
    private String name;
    private int money;

    public User(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public User() {
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
