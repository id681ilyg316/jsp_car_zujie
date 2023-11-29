package com.li.domain;

/**
 * @Program: car_zujie
 * @ClassName: Admin
 * @Description: 管理员
 * @Author: admin
 * @Create: 2020-06-24 09:42
 */
public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
