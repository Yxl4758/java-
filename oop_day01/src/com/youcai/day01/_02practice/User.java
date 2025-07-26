package com.youcai.day01._02practice;

public class User {
    String userName;
    int pssWorld;
    String eMail;

    public User() {
    }

    public User(String userName, int pssWorld) {
        this.userName = userName;
        this.pssWorld = pssWorld;
        this.eMail = userName + "@yc.com";
    }

    public User(String userName, int pssWorld, String eMail) {
        this.userName = userName;
        this.pssWorld = pssWorld;
        this.eMail = eMail;
    }

    public String showInfo(){
        return "UserInfo{" + "姓名：" + this.userName + " 密码：" + this.pssWorld + " 邮箱：" + this.eMail + "}";
    }
}
