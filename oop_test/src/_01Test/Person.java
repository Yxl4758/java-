package _01Test;

public abstract class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age;
    }
}
