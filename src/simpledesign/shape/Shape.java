package simpledesign.shape;

public abstract class Shape {

    protected String lineType;

    protected String color;

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract boolean equals(Shape shape);
}
