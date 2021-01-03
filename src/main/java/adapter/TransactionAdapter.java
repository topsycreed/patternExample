package adapter;

import static constants.Constants.CURRENCY_TARIFF;

public class TransactionAdapter extends DollarTransaction {
    private RubleTransaction rubleTransaction;

    public TransactionAdapter(RubleTransaction rubleTransaction) {
        this.rubleTransaction = rubleTransaction;
    }

    @Override
    public int getAmount() {
        return this.rubleTransaction.getAmount() / CURRENCY_TARIFF;
    }

    public DollarTransaction getDollarTransaction() {
        return new DollarTransaction(getAmount());
    }
}
