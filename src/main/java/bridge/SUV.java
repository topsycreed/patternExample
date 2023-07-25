package bridge;

public class SUV implements Car {
    private Engine engine;

    public SUV(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void manufacture() {
        System.out.print("SUV ");
        engine.start();
        System.out.println("Car manufactured.");
    }
}
