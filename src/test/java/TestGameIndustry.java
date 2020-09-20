import command.*;
import constants.GamerType;
import utils.Logger;
import utils.Messages;
import org.junit.Before;
import org.junit.Test;

import static constants.Constants.*;
import static org.junit.Assert.*;

public class TestGameIndustry {

    Logger logger;

    @Before
    public void clearMessages() {
        Messages.clearText();
        Logger.getInstance();
    }

    @Test
    public void testLoggerSingleton() {
        logger.info("This is a test info message");
        logger.error("This is a test error message");
    }

    @Test
    public void testFactoryMethod() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        GamerFactory factory = new GamerFactory();
        Gamer garry = factory.produceGamer(GamerType.CASUAL, "Garry Rose", "I want to pre-order");
        Gamer wade = factory.produceGamer(GamerType.HARDCORE, "Wade Watts", "Sure, will buy");
        rockstarGames.subscribe(wade);
        rockstarGames.subscribe(garry);
        rockstarGames.release(releaseGame);
        assertEquals(Messages.getText(), FACTORY_MESSAGES);
    }

    @Test
    public void testCommand() {
        String releaseGame = "GTA VI";
        Controller controller = new Controller();
        Game game = new Game(releaseGame);
        Command release = new ReleaseCommand(game);
        Command discount = new DiscountCommand(game);

        controller.setCommand(release);
        controller.executeCommand();

        controller.setCommand(discount);
        controller.executeCommand();
        assertEquals(Messages.getText(), COMMAND_MESSAGES);
    }

    @Test
    public void testSubscriptionObserver() {
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
    public void testUnSubscriptionObserver() {
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
    public void testHardCoreGamerDecorator() {
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
