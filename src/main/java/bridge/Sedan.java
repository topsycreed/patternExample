package bridge;

public class Sedan implements Car {
    private Engine engine;

    public Sedan(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void manufacture() {
        System.out.print("Sedan ");
        engine.start();
        System.out.println("Car manufactured.");
    }
}
