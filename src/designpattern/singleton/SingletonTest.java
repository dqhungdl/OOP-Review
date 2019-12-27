package designpattern.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance(1);
        Singleton singleton2 = Singleton.getInstance(10);
        // Do chỉ có một đối tượng được tạo ra trong Singleton nên getInstance(10) không chạy, kết quả in ra là "1 1"
        System.out.println(singleton1.getValue() + " " + singleton2.getValue());
    }
}
