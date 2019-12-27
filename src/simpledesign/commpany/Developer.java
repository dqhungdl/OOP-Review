package simpledesign.commpany;

public class Developer extends Employee {

    @Override
    public void displayInfo() {
        System.out.print("Developer: " + name);
    }
}
