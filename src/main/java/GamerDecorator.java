abstract class GamerDecorator extends Gamer {

    private Gamer gamer;

    public GamerDecorator(Gamer gamer) {
        this.gamer = gamer;
    }

    public GamerDecorator() {
    }

    public String retrieveName() {
        return gamer.getName();
    }
    public String retrieveReaction() {
        return gamer.getReaction();
    }
}
