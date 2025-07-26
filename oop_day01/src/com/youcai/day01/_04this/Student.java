package com.youcai.day01._04this;
/**
 * this关键字
 * 1.this关键字只能使用在非静态方法中。
 * 2。当this.xxx时，this指代的是未来将要创建的那个对象。
 * 3.当非静态方法中没有局部变量与成员变量重名时，this.可以省略不写
 * 4.类是对象的模板，对象是类的实例
 * */
public class Student {
    String name;
    String Id;
    int age;
    char gender;

    public void study(){
        System.out.println(this.name + "-----正在学习------");
    }
    public void eat(String food){
        System.out.println(this.name + "喜欢吃" + food);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "蔡徐坤";
        s1.Id = "2021303030238";
        s1.age = 18;
        s1.gender = '男';
    }
}
