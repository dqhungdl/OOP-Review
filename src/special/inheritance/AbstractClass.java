package special.inheritance;

public abstract class AbstractClass {

    public void publicAbstractClass() {
    }

    private void privateAbstractClass() {
    }

    public abstract void abstractClass();

    public static void main(String[] args) {
        // Khởi tạo lớp cơ sở
        AbstractClass abstractClass = new ConcreteClass();
        // Gọi được phương thức trừu tượng của lớp dẫn xuất, in ra "HELLO"
        abstractClass.abstractClass();
        // Gọi được phương thức public của lớp cơ sở, không gọi được phương thức private của lớp cơ sở
        abstractClass.publicAbstractClass();

        // Khởi tạo lớp dẫn xuất
        ConcreteClass concreteClass = new ConcreteClass();
        // Gọi được các phương thức public của lớp cơ sở
        concreteClass.publicAbstractClass();
        // Gọi được các phương thức public trong lớp dẫn xuất, không gọi được phương thức private của lớp dẫn xuất
        concreteClass.abstractClass();
        concreteClass.publicConcreteClass();
    }
}
