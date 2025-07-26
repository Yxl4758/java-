package com.youcai.day04._05InnerClass._02StaticInnerClass;

public class Father {
    static class Daughter{
        String name;
        int age;

        public Daughter(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void wok(){
            System.out.println("上班");
        }
    }
}
