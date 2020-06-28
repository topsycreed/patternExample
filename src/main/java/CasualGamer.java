public class CasualGamer extends Gamer {

    public CasualGamer(String name, String reaction) {
        super(name, reaction);
        String text = "New gamer '" + name + "' is born! And wanted to install all games";
        System.out.println(text);
        Messages.addText(text);
    }

    public CasualGamer() {
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
}
