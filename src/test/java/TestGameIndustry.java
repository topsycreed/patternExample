import org.junit.Before;
import org.junit.Test;

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
        Gamer garry = new Gamer("Garry Rose", "I want to pre-order");
        Gamer helen = new Gamer("Helen Jack", "Jesus, it's new game from " + companyName + "!");
        rockstarGames.subscribe(garry);
        rockstarGames.subscribe(helen);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), "New game company is created! 'Rockstar' is working!\n" +
                "New gamer 'Garry Rose' is born! And wanted to install all games!\n" +
                "New gamer 'Helen Jack' is born! And wanted to install all games!\n" +
                "Rockstar succesfully added 'Garry Rose' to subscribers!\n" +
                "Rockstar succesfully added 'Helen Jack' to subscribers!\n" +
                "It's happened! Rockstar releases new game - 'GTA VI'!\n" +
                "Sent notification to: Garry Rose\n" +
                "Garry Rose say: I want to pre-order\n" +
                "Sent notification to: Helen Jack\n" +
                "Helen Jack say: Jesus, it's new game from Rockstar!");
    }

    @Test
    public void testUnSubscription() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        Gamer garry = new Gamer("Garry Rose", "I want to pre-order");
        Gamer helen = new Gamer("Helen Jack", "Jesus, it's new game from " + companyName + "!");
        rockstarGames.subscribe(garry);
        rockstarGames.unsubscribe(garry);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), "New game company is created! 'Rockstar' is working!\n" +
                "New gamer 'Garry Rose' is born! And wanted to install all games!\n" +
                "New gamer 'Helen Jack' is born! And wanted to install all games!\n" +
                "Rockstar succesfully added 'Garry Rose' to subscribers!\n" +
                "Rockstar succesfully removed 'Garry Rose' from subscribers!\n" +
                "It's happened! Rockstar releases new game - 'GTA VI'!\n" +
                "Nobody subscribed to the news of Rockstar! It's so sad :( We need to hire better advertisement manager...");
    }
}
