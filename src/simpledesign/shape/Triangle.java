package simpledesign.shape;

public class Triangle extends Shape {

    private Point p1;

    private Point p2;

    private Point p3;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public double getArea() {
        return (double) ((p1.getX() - p2.getX()) * (p1.getY() + p2.getY())
                + (p2.getX() - p3.getY()) * (p2.getY() + p3.getY())
                + (p3.getX() - p1.getY()) * (p3.getX() + p3.getY())) / 2.0;
    }

    @Override
    public boolean equals(Shape shape) {
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            return p1.equals(triangle.p1) && p2.equals(triangle.p2) && p3.equals(triangle.p3);
        }
        return false;
    }
}
