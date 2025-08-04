package _06Test;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract Animal[] eat();
}
