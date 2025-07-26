package com.youcai202503.day02._01Block;

import com.sun.tools.javac.Main;

import java.lang.annotation.AnnotationTypeMismatchException;

public class Person {
    static int a;
    String name;
    int age;
    static {
        System.out.println("---加载静态资源---");
        a = 10;
    }

    public static void main(String[] args) {
        Person person  = null;
    }
}
