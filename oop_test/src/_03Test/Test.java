package _03Test;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("园",3.0);
        circle.display(circle);
        circle.resize(2.0);
        circle.display(circle);

        Rectangle rectangle = new Rectangle("矩形",6,4);
        rectangle.display(rectangle);

        Square square = new Square("正方形",5);
        square.display(square);
    }
}
