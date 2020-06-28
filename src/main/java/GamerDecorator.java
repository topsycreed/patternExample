abstract class GamerDecorator extends Gamer {
    private Gamer gamer;

    public GamerDecorator(Gamer gamer) {
        this.gamer = gamer;
    }

    public String getName() {
        return gamer.getName();
    }

    public String getReaction() {
        return gamer.getReaction();
    }
}
