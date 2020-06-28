import java.util.HashSet;
import java.util.Set;

import static utils.Messages.printMessage;

abstract class Gamer implements Observer {

    protected String name;
    protected String reaction;

    protected Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction) {
        this.name = name;
        this.reaction = reaction;
    }

    protected Gamer() {
    }

    public void buyGame(String game) {
        games.add(game);
        printMessage(name + " say: " + reaction);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }
}
