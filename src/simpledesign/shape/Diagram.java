package simpledesign.shape;

import java.util.ArrayList;
import java.util.List;

public class Diagram {

    private List<Shape> shapes = new ArrayList<>();

    public Shape getMaxAreaShape() {
        Shape resultShape = null;
        double maxArea = -1;
        for (Shape shape : shapes)
            if (maxArea < resultShape.getArea()) {
                maxArea = resultShape.getArea();
                resultShape = shape;
            }
        return resultShape;
    }

    public boolean contains(Shape shape) {
        for (Shape tempShape : shapes)
            if (shape.equals(tempShape))
                return true;
        return false;
    }
}
