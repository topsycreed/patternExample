package command;

public class ReleaseCommand implements Command {
    private Game game;

    public ReleaseCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.release();
    }
}
