package designpattern.decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw: rectangle");
    }
}
