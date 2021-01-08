import lombok.Getter;

import java.io.Serializable;

@Getter
public abstract class Payment implements Serializable {

    private String destination;
    private int amount;

    public Payment(String destination, int amount) {
        this.destination = destination;
        this.amount = amount;
    }

    public Payment() {
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s", getDestination(), getAmount());
    }
}
