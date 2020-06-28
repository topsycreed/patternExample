import java.util.HashSet;
import java.util.Set;

public class Gamer implements Observer {
    private String name;
    private String reaction;

    private Set<String> games = new HashSet<>();

    public Gamer(String name, String reaction) {
        this.reaction = reaction;
        this.name = name;
        System.out.println("New gamer '" + this.name + "' is born! And wanted to install all games!");
    }

    public void buyGame(String game) {
        games.add(game);
        System.out.println(name + " say: " + reaction);
    }

    @Override
    public void update(String game) {
        if (games.contains(game)) {
            System.out.println("What? They've already released this game ... I don't understand");
        } else {
            buyGame(game);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
