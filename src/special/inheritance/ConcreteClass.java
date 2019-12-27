package special.inheritance;

public class ConcreteClass extends AbstractClass {

    public void publicConcreteClass() {
    }

    private void privateConcreteClass() {
    }

    @Override
    public void abstractClass() {
        System.out.print("HELLO");
    }
}
