import java.util.ArrayList;
import java.util.List;

import static utils.Messages.printMessage;

public class Publisher implements Observable {
    public String companyName;
    public String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    public Publisher(String companyName) {
        this.companyName = companyName;
        printMessage("New game company is created! '" + this.companyName + "' is working!");
    }

    public void release(String game) {
        this.releaseGame = game;
        printMessage("It's happened! " + this.companyName + " releases new game - '" + this.releaseGame + "'!");
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        printMessage(this.companyName + " succesfully added '" + observer + "' to subscribers!");
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        printMessage(this.companyName + " succesfully removed '" + observer + "' from subscribers!");
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        if (observers.size() == 0) {
            printMessage("Nobody subscribed to the news of " + this.companyName + "! It's so sad :( We need to hire better advertisement manager...");
        } else {
            for (Observer observer : observers) {
                printMessage("Sent notification to: " + observer);
                observer.update(releaseGame);
            }
        }
    }
}
