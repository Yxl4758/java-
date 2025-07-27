package _03Test;

public abstract class Shape {
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public void display(Shape shape) {
        System.out.println("图形：" + shape.getName() + " 面积：" + shape.area() + " 周长：" + shape.perimeter());
    }
}
