package _02Test;

public class PingpongAthlete extends Athlete implements English {

    public PingpongAthlete() {

    }
    public PingpongAthlete(String name, int age ){
        super(name, age);
        name = super.getName();
        age = super.getAge();
    }

    @Override
    public void study() {
        System.out.print("乒乓球运动员学习如何发球和接球 ");
    }

    @Override
    public void eat() {
        System.out.print("乒乓球运动员吃大白菜，喝小米粥 ");
    }

    @Override
    public void sleep() {
        System.out.print("人都是要睡觉的 ");
    }

    @Override
    public void speekEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public String toString() {
        return super.getName() + "---" + super.getAge();
    }
}
