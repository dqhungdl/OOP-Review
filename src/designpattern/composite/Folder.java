package designpattern.composite;

import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String name, List<File> files) {
        super(name);
        this.files = files;
    }

    @Override
    public void showInfo() {
        System.out.println("Folder: " + name);
        System.out.println("###");
        for (File file : files)
            file.showInfo();
        System.out.println("###");
    }
}
