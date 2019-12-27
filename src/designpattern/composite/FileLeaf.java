package designpattern.composite;

public class FileLeaf extends File {

    public FileLeaf(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name);
    }
}
