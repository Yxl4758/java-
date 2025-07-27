package _03Test;

public class Circle extends Shape implements Resizable{

    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public void resize(double scale) {
        this.radius *= scale;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
