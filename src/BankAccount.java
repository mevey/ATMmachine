import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private final ArrayList<Object> transactions;

    public BankAccount() {
        this.balance=0.0;
        this.transactions = new ArrayList<>();
    }

    public double balance() {
        return this.balance;
    }

    public double makeDeposit(Double amount) {
        this.balance += amount;
        this.transactions.add(amount);
        return this.balance;
    }
}
