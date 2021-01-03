package adapter;

import static utils.Messages.printMessage;

public class Account {
    private int moneyInDollars;

    public Account() {
        this.moneyInDollars = 0;
    }

    public void add(DollarTransaction dollarTransaction) {
        printMessage("Added " + dollarTransaction.getAmount() + "$ to account");
        this.moneyInDollars += dollarTransaction.getAmount();
    }

    public int getMoneyBalance() {
        printMessage("Account balance is " + this.moneyInDollars + "$");
        return this.moneyInDollars;
    }
}
