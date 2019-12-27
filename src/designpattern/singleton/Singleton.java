package designpattern.singleton;

public class Singleton {

    private static Singleton instance;
    private Integer value;

    private Singleton(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static Singleton getInstance(int value) {
        if (instance == null)
            instance = new Singleton(value);
        return instance;
    }
}
