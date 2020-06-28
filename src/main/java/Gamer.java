import java.util.HashSet;
import java.util.Set;

public class Gamer implements Observer {
    private String name;
    private String reaction;

    private Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction) {
        this.reaction = reaction;
        this.name = name;
        String text = "New gamer '" + this.name + "' is born! And wanted to install all games!";
        System.out.println(text);
        Messages.addText(text);
    }

    public void buyGame(String game) {
        games.add(game);
        String text = name + " say: " + reaction;
        System.out.println(text);
        Messages.addText(text);
    }

    @Override
    public void update(String game) {
        if (games.contains(game)) {
            String text = "What? They've already released this game ... I don't understand";
            System.out.println(text);
            Messages.addText(text);
        } else {
            buyGame(game);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
