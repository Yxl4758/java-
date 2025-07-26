package com.youcai.day04._03Interface;

public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;//this.age - o.age升序 -（this.age - o.age）降序
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
