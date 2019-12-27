package designpattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        ArithmeticLibrary arithmeticLibrary = new ArithmeticLibrary();
        Framework framework = new Adapter(arithmeticLibrary);
        System.out.print(framework.addNumber(4, 123));
    }
}
