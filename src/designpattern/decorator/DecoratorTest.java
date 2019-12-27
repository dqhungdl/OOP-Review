package designpattern.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle = new RedShapeDecorator(circle);
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle = new RedShapeDecorator(rectangle);
        rectangle.draw();
    }
}
