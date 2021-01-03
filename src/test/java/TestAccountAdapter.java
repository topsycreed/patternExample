import adapter.Account;
import adapter.DollarTransaction;
import adapter.RubleTransaction;
import adapter.TransactionAdapter;
import facade.CarFacade;
import facade.Engine;
import facade.HeatedSeats;
import facade.StereoSystem;
import org.junit.Before;
import org.junit.Test;
import utils.Logger;
import utils.Messages;

import static constants.Constants.*;
import static org.junit.Assert.assertEquals;

public class TestAccountAdapter {

    @Before
    public void clearMessages() {
        Messages.clearText();
        Logger.getInstance();
    }

    @Test
    public void testDollarTransaction() {
        Account account = new Account();
        DollarTransaction dollarTransaction = new DollarTransaction(10);
        account.getMoneyBalance();
        account.add(dollarTransaction);
        account.getMoneyBalance();
        assertEquals(Messages.getText(), DOLLAR_MESSAGES);
    }

    @Test
    public void testRublesTransaction() {
        Account account = new Account();
        RubleTransaction rubleTransaction = new RubleTransaction(500);
        TransactionAdapter transactionAdapter = new TransactionAdapter(rubleTransaction);
        DollarTransaction dt = transactionAdapter.getDollarTransaction();
        account.getMoneyBalance();
        account.add(dt);
        account.getMoneyBalance();
        assertEquals(Messages.getText(), RUBLES_MESSAGES);
    }
}
