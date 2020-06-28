import org.junit.Test;

public class TestGameIndustry {

    @Test
    public void test() {
        String companyName = "Rockstar";
        String releaseGame = "GTA VI";
        Publisher rockstarGames = new Publisher(companyName);
        Gamer garry = new Gamer("Garry Rose", "I want to pre-order");
        Gamer peter = new Gamer("Peter Johnston", "Pinch me...");
        Gamer helen = new Gamer("Helen Jack", "Jesus, it's new game from " + companyName + "!");
        Gamer michiel = new Gamer("Michiel Cane", "Hate to be subscribed to " + companyName + "! They sending a lot of crap to my mail");
        rockstarGames.subscribe(garry);
        rockstarGames.subscribe(peter);
        rockstarGames.subscribe(helen);
        rockstarGames.subscribe(michiel);
        rockstarGames.unsubscribe(michiel);
        rockstarGames.release(releaseGame);
    }
}
