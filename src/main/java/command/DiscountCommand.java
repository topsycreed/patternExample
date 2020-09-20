package command;

public class DiscountCommand implements Command {
    private Game game;

    public DiscountCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.discount();
    }
}
