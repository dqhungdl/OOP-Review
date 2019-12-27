package designpattern.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        FurnitureAbstractFactory woodFactory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair woodChair = woodFactory.createChair();
        Table woodTable = woodFactory.createTable();
        woodChair.create();
        woodTable.create();

        FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair plasticChair = plasticFactory.createChair();
        Table plasticTable = plasticFactory.createTable();
        plasticChair.create();
        plasticTable.create();
    }
}
