import java.util.HashSet;
import java.util.Set;

abstract class Gamer implements Observer {
    String name;
    String reaction;

    Set<String> games = new HashSet<>();

    public void buyGame(String game) {
        games.add(game);
        String text = name + " say: " + reaction;
        System.out.println(text);
        Messages.addText(text);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public abstract void update(String game);

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
