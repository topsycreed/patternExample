package strategy;

public class Sleeping implements Activity {
    @Override
    public void startActivity() {
        System.out.println("Sleeping... zzzz...");
    }
}
