package _02Test;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
        name = getName();
        age = getAge();
    }

    @Override
    public void teach() {
        System.out.print("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.print("篮球教练吃羊肉，喝羊奶 ");
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
