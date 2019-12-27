package designpattern.prototype;

public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public Person clone() {
        return new Person(this.name);
    }

    public void print() {
        System.out.println("Person: " + name);
    }
}
