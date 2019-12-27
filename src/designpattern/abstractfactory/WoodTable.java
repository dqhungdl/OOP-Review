package designpattern.abstractfactory;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Wood table");
    }
}
