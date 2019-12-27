package simpledesign.shape;

public class Rectangle extends Shape {

    private Point leftBottomCorner;

    private int height;

    private int width;

    public Point getLeftBottomCorner() {
        return leftBottomCorner;
    }

    public void setLeftBottomCorner(Point leftBottomCorner) {
        this.leftBottomCorner = leftBottomCorner;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public boolean equals(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return leftBottomCorner.equals(rectangle.leftBottomCorner) && height == rectangle.getHeight() && width == rectangle.getWidth();
        }
        return false;
    }
}
