package com.youcai.day01._01practice;

public class Main {
    public static void main(String[] args) {
        Book bk = new Book("活着",300.0,8);
        bk.display();
        bk.borrow();
        bk.restore();
    }
}
