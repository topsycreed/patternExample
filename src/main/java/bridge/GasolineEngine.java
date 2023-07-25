package bridge;

public class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Engine started with gasoline.");
    }
}