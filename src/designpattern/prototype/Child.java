package designpattern.prototype;

public class Child extends Person {

    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public Child clone() {
        return new Child(this.name, this.age);
    }

    public void print() {
        System.out.println("Child " + name + " " + age);
    }
}
