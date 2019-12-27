package designpattern.composite;

import java.util.Arrays;

public class CompositeTest {
    public static void main(String[] args) {
        File file1 = new FileLeaf("file1");
        File file2 = new FileLeaf("file2");
        File folder1 = new Folder("folder1", Arrays.asList(file1));
        File folder2 = new Folder("folder2", Arrays.asList(file2, folder1));
        folder2.showInfo();
    }
}
