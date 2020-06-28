public class HardCoreGamer extends GamerDecorator {
    public HardCoreGamer(Gamer gamer) {
        super(gamer);
        this.name = getName();
        this.reaction = getReaction();
    }

    public void buySoundtrack(String game) {
        String text = this.name + " say: I will definitely buy a soundtrack to the game " + game;
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
            buySoundtrack(game);
        }
    }
}
