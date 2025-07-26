package com.youcai.day04._01InterfaceTest2;

public class Program {
    public static void main(String[] args) {
        Employee p1 = new Person("张三",18);
        Family p2 = new Person("李四",20);
        Person p3 = new Person("王五",23);

        testPlay(p1);
        testPlay(p2);
        testPlay(p3);
    }
    public static void testPlay(Person person){
        person.play();
        person.cook();
    }

    public static void testPlay(Employee employee){
        employee.work();
        employee.punchCard();
    }

    public static void testPlay(Family family){
        family.cook();
        family.wash();
    }
}
