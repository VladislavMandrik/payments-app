import lombok.Builder;
import lombok.Getter;

@Getter
public class AccountsEntity extends Payment {

    String bankname;
    int accountnumber;
    String surname;
    String name;
    String middlename;
    String entityname;
    int regnumber;

    @Builder
    public AccountsEntity(String destantion, int amount, String bankname, int accountnumber, String entityname,
                          int regnumber, String surname, String name, String middlename) {

        super(destantion, amount);
        this.bankname = bankname;
        this.accountnumber = accountnumber;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.entityname = entityname;
        this.regnumber = regnumber;
    }

    @Override
    public String toString() {
        return "Entity payment|     " + super.toString() + String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s",
                getBankname(), getAccountnumber(), getSurname(), getName(), getMiddlename(), getEntityname(), getRegnumber());
    }
}