import lombok.Builder;
import lombok.Getter;

@Getter
public class IndividualCash extends Individual {

    int checkNumber;

    @Builder
    public IndividualCash(String destination, int amount, String surname, String name,
                          String middleName, String passSeries, int passNumber, int checkNumber) {

        super(destination, amount, surname, name, middleName, passSeries, passNumber);
        this.checkNumber = checkNumber;
    }

    @Override
    public String toString() {
        return "Individual cash payment|     " + super.toString() + String.format("%-15s", getCheckNumber());
    }
}