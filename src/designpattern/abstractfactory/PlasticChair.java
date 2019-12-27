package designpattern.abstractfactory;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Plastic chair");
    }
}
