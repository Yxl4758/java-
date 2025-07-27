package _02Test;

public abstract class Athlete extends Person{
    public Athlete(){

    }
    public Athlete(String name, int age){
        super(name, age);
        name = super.getName();
        age = super.getAge();
    }

    public abstract void study();
}
