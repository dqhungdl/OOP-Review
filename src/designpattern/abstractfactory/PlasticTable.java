package designpattern.abstractfactory;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Plastic table");
    }
}
