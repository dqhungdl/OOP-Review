package designpattern.abstractfactory;

public class FurnitureFactory {

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new IllegalArgumentException("Factory not found");
        }
    }
}
