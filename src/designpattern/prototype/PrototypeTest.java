package designpattern.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        Child child = new Child("David", 12);
        Person clonePerson = child.clone();
        Child cloneChild = child.clone();
        clonePerson.print();
        cloneChild.print();
    }
}
