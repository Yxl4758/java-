package com.youcai.day03._02Sub;

import com.youcai.day03._01Privileges.Person;
/**
 * 验证父类的成员变量被各种修饰词的特点
 *
 * */
public class Student extends Person {
    public void test2(){
        System.out.println(super.a);
        System.out.println(super.b);
//        System.out.println(super.c);
//        System.out.println(super.d);
    }
}
