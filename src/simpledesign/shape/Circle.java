package simpledesign.shape;

public class Circle extends Shape {

    private Point center;

    private int radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * 3.14 * radius;
    }

    @Override
    public boolean equals(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return center.equals(circle.center) && radius == circle.radius;
        }
        return false;
    }
}
