package com.youcai.day04._05InnerClass._04NickNameClasss;
import java.util.Arrays;
import java.util.Comparator;
/**
 * 匿名内部类
 * 1.   写在方法中
 * 2.   只在一处使用一次，因此没有必要定义该类的类结构
 * 3.   匿名内部类一般都是向上造型这种多态写法，父类一般都是抽象类或者是接口
 * 4.   父类型名 变量名 = new 父类型名(){
 *          重写方法
 *      }
 *
 * */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher[] ts = new Teacher[4];
        for (int i = 0; i < ts.length; i++) {
            ts[i]= new Teacher((int)(Math.random()*10)+30);
        }
        Arrays.sort(ts);
        System.out.println(Arrays.toString(ts));

        Comparator<Teacher> c = new Comparator<>(){
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o2.getAge() - o1.getAge();
            }
        };

        Arrays.sort(ts,c);
        System.out.println(Arrays.toString(ts));
    }
}

