package _01Test;

public class English extends Person{
    public English(String name, char gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("我是英国人，我喜欢吃三明治！");
    }

    public void horseRiding(){
        System.out.println(super.getName() + "正在练习骑马！");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
