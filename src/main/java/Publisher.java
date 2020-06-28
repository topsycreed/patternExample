import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable {
    public String companyName;
    public String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    public Publisher(String companyName) {
        this.companyName = companyName;
    }

    public void release(String game) {
        this.releaseGame = game;
        System.out.println("It's happened! " + this.companyName + " releases new game - " + this.releaseGame + "!");
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : observers) {
            System.out.println("Sent notification to: " + observer);
            observer.update(releaseGame);
        }
    }
}
