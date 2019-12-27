package designpattern.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Bank tpBank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(tpBank.getBankName());
        Bank vietcomBank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(vietcomBank.getBankName());
    }
}
