package com.youcai.day01._06Constructor;
/**
 * 有参传参
 * 1. 在构造器中使用，而且只能在首行首句中使用
 * 2.表示调用本类中的其他构造器用来简化赋值操作
 * 3.
 * */
public class Student {
    int id;
    String stuName;
    int age;
    char gender;

    public Student() {
    }

    public Student(int id){
        this.id = id;
    }

    public Student(int id, String stuName){
        this(id);
        this.stuName = stuName;
    }

    public Student(int id, String stuName, int age){
        this(id, stuName);
        this.age = age;
    }

    public Student(int id, String stuName, int age, char gender) {
        this(id, stuName, age);
        this.gender = gender;
    }

    public String toString() {
        return "Student{id = " + id + ", stuName = " + stuName + ", age = " + age + ", gender = " + gender + "}";
    }
}
