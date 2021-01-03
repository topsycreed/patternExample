package facade;

import static utils.Messages.printMessage;

public class Engine {
    private String description;

    public Engine() {
        this.description = "Engine";
    }

    void on() {
        printMessage(this.description + " is on");
//        System.out.println(this.description + " is on");
    }

    void off() {
        printMessage(this.description + " is off");
//        System.out.println(this.description + " is off");
    }
}
