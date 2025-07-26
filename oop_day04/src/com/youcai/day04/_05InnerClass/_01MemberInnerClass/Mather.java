package com.youcai.day04._05InnerClass._01MemberInnerClass;

/**
 *
 * */

public class Mather {
    private String name;
    private int age;

    public Mather() {
    }

    public Mather(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void cool(){
        System.out.println("酷");
    }

    public String toString() {
        return "Mather{name = " + name + ", age = " + age + "}";
    }

    class Son{
        private String name;
        private int age;

        public Son(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Son{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
        public void sleep(){
            System.out.println("睡觉");
        }
    }
}
