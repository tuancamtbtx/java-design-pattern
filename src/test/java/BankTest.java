import java.time.LocalDate;

/**
 * @author tuan.nguyen3
 */
public class BankTest {
    private String name;
    private LocalDate endDate;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
