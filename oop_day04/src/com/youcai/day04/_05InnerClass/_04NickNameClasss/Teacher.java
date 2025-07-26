package com.youcai.day04._05InnerClass._04NickNameClasss;

public class Teacher implements Comparable<Teacher>{
    private int age;

    public Teacher(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.age - o.age;
    }
}
