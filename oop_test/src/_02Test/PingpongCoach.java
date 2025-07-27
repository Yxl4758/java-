package _02Test;

public class PingpongCoach extends Coach implements English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
        name = super.getName();
        age = super.getAge();
    }

    @Override
    public void teach() {
        System.out.print("乒乓球教练教如何发球和接球 ");
    }

    @Override
    public void speekEnglish() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void eat() {
        System.out.print("乒乓球教练吃小白菜，喝大米粥 ");
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
