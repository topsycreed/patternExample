import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable {
    public String companyName;
    public String releaseGame;
    private List<Observer> observers = new ArrayList<>();

    public Publisher(String companyName) {
        this.companyName = companyName;
        String text = "New game company is created! '" + this.companyName + "' is working!";
        System.out.println(text);
        Messages.addText(text);
    }

    public void release(String game) {
        this.releaseGame = game;
        String text = "It's happened! " + this.companyName + " releases new game - '" + this.releaseGame + "'!";
        System.out.println(text);
        Messages.addText(text);
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        String text = this.companyName + " succesfully added '" + observer + "' to subscribers!";
        System.out.println(text);
        Messages.addText(text);
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        String text = this.companyName + " succesfully removed '" + observer + "' from subscribers!";
        System.out.println(text);
        Messages.addText(text);
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        if (observers.size() == 0) {
            String text = "Nobody subscribed to the news of " + this.companyName + "! It's so sad :( We need to hire better advertisement manager...";
            System.out.println(text);
            Messages.addText(text);
        } else {
            for (Observer observer : observers) {
                String text = "Sent notification to: " + observer;
                System.out.println(text);
                Messages.addText(text);
                observer.update(releaseGame);
            }
        }
    }
}
