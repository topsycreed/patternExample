package adapter;

public class DollarTransaction {
    private int amount;

    DollarTransaction() {
        this.amount = 0;
    }

    public DollarTransaction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
