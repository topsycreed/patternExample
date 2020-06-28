public class CasualGamer extends Gamer {

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
