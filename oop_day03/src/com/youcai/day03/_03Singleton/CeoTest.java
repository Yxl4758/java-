package com.youcai.day03._03Singleton;

public class CeoTest {
    public static void main(String[] args) {
        Ceo c1 = Ceo.getInstance();
        Ceo c2 = Ceo.getInstance();

        System.out.println(c1.equals(c2));
    }
}
