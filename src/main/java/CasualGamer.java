import static Utils.Messages.printMessage;

public class CasualGamer extends Gamer {

    public CasualGamer(String name, String reaction) {
        super(name, reaction);
        printMessage("New gamer '" + name + "' is born! And wanted to install all games");
    }

    public CasualGamer() {
    }

    @Override
    public void update(String game) {
        if (games.contains(game)) {
            printMessage("What? They've already released this game ... I don't understand");
        } else {
            buyGame(game);
        }
    }
}
