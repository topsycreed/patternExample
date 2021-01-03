package facade;

import static utils.Messages.printMessage;

public class HeatedSeats {
    private String description;
    private int heatLevel;

    public HeatedSeats() {
        this.description = "HeatedSeats System";
    }

    void on() {
        heatLevel = 1;
        printMessage(this.description + " is on");
//        System.out.println(this.description + " is on");
    }

    void off() {
        heatLevel = 0;
        printMessage(this.description + " is off");
//        System.out.println(this.description + " is off");
    }

    void increaseHeatLevel() {
        if (heatLevel == 0) {
            on();
        } else if (heatLevel == 1 || heatLevel == 2) {
            heatLevel++;
        } else {
            printMessage(this.description + " is overheated. Turning it off.");
//            System.out.println(this.description + " is overheated. Turning it off.");
            off();
        }
    }
}
