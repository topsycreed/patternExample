import static utils.Messages.printMessage;

public class HardCoreGamer extends GamerDecorator {

    public HardCoreGamer(Gamer gamer) {
        super(gamer);
        this.name = retrieveName();
        this.reaction = retrieveReaction();
        printMessage("Beware! Gamer called '" + this.name + "' became hardcore player");
    }

    public void buySoundtrack(String game) {
        printMessage(this.name + " say: I will definitely buy a soundtrack for the game " + game);
    }

    @Override
    public void update(String game) {
        if (games.contains(game)) {
            printMessage("What? They've already released this game ... I don't understand");
        } else {
            buyGame(game);
            buySoundtrack(game);
        }
    }
}
