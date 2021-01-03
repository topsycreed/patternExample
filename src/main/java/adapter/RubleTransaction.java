package adapter;

public class RubleTransaction {
    private int amount;

    RubleTransaction() {
        this.amount = 0;
    }

    public RubleTransaction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
