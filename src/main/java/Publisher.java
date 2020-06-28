import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable {
    public String companyName;
    public String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    public Publisher(String companyName) {
        this.companyName = companyName;
        System.out.println("New game company is created! '" + this.companyName + "' is working!");
    }

    public void release(String game) {
        this.releaseGame = game;
        System.out.println("It's happened! " + this.companyName + " releases new game - '" + this.releaseGame + "'!");
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        System.out.println(this.companyName + " succesfully added '" + observer + "' to subscribers!");
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        System.out.println(this.companyName + " succesfully removed '" + observer + "' from subscribers!");
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
