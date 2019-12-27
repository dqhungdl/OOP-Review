package designpattern.composite;

public abstract class File {

    protected String name;

    public File(String name) {
        this.name = name;
    }

    public abstract void showInfo();
}
