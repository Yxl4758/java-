package com.youcai.day04._02Interface;

/**
 * 接口（jdk1.8之后）新特性
 * 1.   提供了default修饰的方法
 *          -某些子类里的方法逻辑可能是一样的，因此可以在父类中直接提供即可，没有必要在子类中写。
 *          -父类如果是接口的话，需要在方法上添加修饰词default；
 * 2.   提供了static修饰的方法
 *          -简化子类的代码重复编写
 *          -子类不能直接调用从接口里继承过来的static方法，可以使用接口名调用。
 * */

public interface Animal {

}
