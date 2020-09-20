package command;

import static utils.Messages.printMessage;

public class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    void release() {
        printMessage(this.name + " was released");
    }

    void discount() {
        printMessage(this.name + " now on discount");
    }
}
