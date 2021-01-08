import lombok.Getter;

@Getter
public abstract class Individual extends Payment {

    private String surname;
    private String name;
    private String middleName;
    private String passSeries;
    private int passNumber;

    public Individual(String destination, int amount, String surname,
                      String name, String middleName, String passSeries, int passNumber) {
        super(destination, amount);
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.passSeries = passSeries;
        this.passNumber = passNumber;
    }

    public Individual() {
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s %-15s %-15s %-15s %-15s", getSurname(),
                getName(), getMiddleName(), getPassSeries(), getPassNumber());
    }
}