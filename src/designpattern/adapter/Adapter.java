package designpattern.adapter;

public class Adapter implements Framework {

    private ArithmeticLibrary arithmeticLibrary;

    public Adapter(ArithmeticLibrary arithmeticLibrary) {
        this.arithmeticLibrary = arithmeticLibrary;
    }

    @Override
    public int addNumber(int a, int b) {
        return arithmeticLibrary.add(a, b);
    }
}
