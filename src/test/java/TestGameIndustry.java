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
        CasualGamer garry = new CasualGamer();
        garry.setName("Garry Rose");
        garry.setReaction("I want to pre-order");
        CasualGamer helen = new CasualGamer();
        helen.setName("Helen Jack");
        helen.setReaction("Jesus, it's new game from " + companyName + "!");
        rockstarGames.subscribe(garry);
        rockstarGames.subscribe(helen);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), "New game company is created! 'Rockstar' is working!\n" +
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
        CasualGamer garry = new CasualGamer();
        garry.setName("Garry Rose");
        garry.setReaction("I want to pre-order");
        CasualGamer helen = new CasualGamer();
        helen.setName("Helen Jack");
        helen.setReaction("Jesus, it's new game from " + companyName + "!");
        rockstarGames.subscribe(garry);
        rockstarGames.unsubscribe(garry);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), "New game company is created! 'Rockstar' is working!\n" +
                "Rockstar succesfully added 'Garry Rose' to subscribers!\n" +
                "Rockstar succesfully removed 'Garry Rose' from subscribers!\n" +
                "It's happened! Rockstar releases new game - 'GTA VI'!\n" +
                "Nobody subscribed to the news of Rockstar! It's so sad :( We need to hire better advertisement manager...");
    }

    @Test
    public void testHardCoreGamer() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        Gamer wade = new CasualGamer();
        wade.setName("Wade Watts");
        wade.setReaction("Sure, will buy");
        //using decorator to add HardCoreGamer function
        wade = new HardCoreGamer(wade);
        CasualGamer garry = new CasualGamer();
        garry.setName("Garry Rose");
        garry.setReaction("I want to pre-order");
        rockstarGames.subscribe(wade);
        rockstarGames.subscribe(garry);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), "New game company is created! 'Rockstar' is working!\n" +
                "Rockstar succesfully added 'Wade Watts' to subscribers!\n" +
                "Rockstar succesfully added 'Garry Rose' to subscribers!\n" +
                "It's happened! Rockstar releases new game - 'GTA VI'!\n" +
                "Sent notification to: Wade Watts\n" +
                "Wade Watts say: Sure, will buy\n" +
                "Wade Watts say: I will definitely buy a soundtrack to the game GTA VI\n" +
                "Sent notification to: Garry Rose\n" +
                "Garry Rose say: I want to pre-order");
    }
}
