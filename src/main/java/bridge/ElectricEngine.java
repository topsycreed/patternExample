package bridge;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Engine started with electricity.");
    }
}
