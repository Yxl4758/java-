package _06Test;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public Cat[] eat() {
        return new Cat[0];
    }
}
