import java.util.Optional;

/**
 * @author tuan.nguyen3
 */
public class Test {

    public static void main(String[] args) {
        BankTest bankTest = new BankTest();
        bankTest.setEndDate(null);
        Optional.ofNullable(bankTest.getEndDate()).ifPresent(e -> System.out.println("Bank Test is not null"));
//        if(!bankTest.getEndDate().isEqual(null)) {
//            System.out.println("Bank Test is not null");
//        }


    }
}
