package _02Test;

public class BasketballAthlete extends Athlete {

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
        name = super.getName();
        age = super.getAge();
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.print("篮球运动员吃牛肉，喝牛奶 ");
    }

    @Override
    public void sleep() {
        System.out.print("人都是要睡觉的 ");
    }

    @Override
    public String toString() {
        return super.getName() + "---" + super.getAge();
    }
}
