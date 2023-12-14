import java.util.List;
import java.util.Optional;

/**
 * @author tuan.nguyen3
 */
public class OptionalTest {
    public static void main(String[] args) {
        List<String> schemaProviders = null;
        Optional<String> providerName = schemaProviders.stream().filter(p -> p.getClass().getName().equals("providerName")).findFirst();
        System.out.println("Hello World!");
    }
}
