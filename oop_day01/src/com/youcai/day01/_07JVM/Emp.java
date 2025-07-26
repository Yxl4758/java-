package com.youcai.day01._07JVM;

import javax.print.attribute.standard.MediaSizeName;

public class Emp {
    String name;
    int age;

    public Emp() {
    }

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int work(int a, int b, int c){
        int r = a + b;
        int s = r * 7 + c;
        return s;
    }

    public String toString() {
        return "Emp{name = " + name + ", age = " + age + "}";
    }
}
