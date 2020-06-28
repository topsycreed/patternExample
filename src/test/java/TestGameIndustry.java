import utils.Messages;
import org.junit.Before;
import org.junit.Test;

import static constants.Constants.*;
import static org.junit.Assert.*;

public class TestGameIndustry {

    @Before
    public void clearMessages() {
        Messages.clearText();
    }

    @Test
    public void testSubscription() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        CasualGamer garry = new CasualGamer("Garry Rose", "I want to pre-order");
        CasualGamer helen = new CasualGamer("Helen Jack", "Jesus, it's new game from " + companyName + "!");
        rockstarGames.subscribe(garry);
        rockstarGames.subscribe(helen);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), SUBSCRIPTION_MESSAGES);
    }

    @Test
    public void testUnSubscription() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        CasualGamer garry = new CasualGamer("Garry Rose", "I want to pre-order");
        CasualGamer helen = new CasualGamer("Helen Jack", "Jesus, it's new game from " + companyName + "!");
        rockstarGames.subscribe(garry);
        rockstarGames.unsubscribe(garry);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), UNSUBSCRIPTION_MESSAGES);
    }

    @Test
    public void testHardCoreGamer() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        Gamer wade = new CasualGamer("Wade Watts", "Sure, will buy");
        //using decorator pattern to add HardCoreGamer function
        wade = new HardCoreGamer(wade);
        CasualGamer garry = new CasualGamer("Garry Rose", "I want to pre-order");
        //using observer pattern to add listeners to subscription
        rockstarGames.subscribe(wade);
        rockstarGames.subscribe(garry);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), HARDCORE_MESSAGES);
    }
}
