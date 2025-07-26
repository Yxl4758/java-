package com.youcai.day01._07JVM;

public class Company {
    String name;
    Emp[] emps;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String toString() {
        return "Company{name = " + name + ", emps = " + emps + "}";
    }

    public static void main(String[] args) {
    }
}
