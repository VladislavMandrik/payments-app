import lombok.Builder;
import lombok.Getter;

@Getter
public class IndividualCashless extends Individual {
    String bankName;
    int accountNumber;

    @Builder
    public IndividualCashless(String destination, int amount, String surname,
                              String name, String middleName, String passSeries,
                              int passNumber, String bankName, int accountNumber) {

        super(destination, amount, surname, name, middleName, passSeries, passNumber);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Individual cashless payment|     " + super.toString() + String.format
                ("%-15s %-15s", getBankName(), getAccountNumber());
    }
}