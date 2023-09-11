import bridge.Car;
import bridge.ElectricEngine;
import bridge.Engine;
import bridge.GasolineEngine;
import bridge.SUV;
import bridge.Sedan;
import org.junit.jupiter.api.Test;

public class TestBridgePattern {

    @Test
    public void bridgePatternTest() {
        // Creating different engine implementations
        Engine gasolineEngine = new GasolineEngine();
        Engine electricEngine = new ElectricEngine();

        // Creating cars with different engines
        Car sedanWithGasoline = new Sedan(gasolineEngine);
        Car suvWithElectric = new SUV(electricEngine);

        // Manufacturing cars
        sedanWithGasoline.manufacture();
        // Output: Sedan Engine started with gasoline. Car manufactured.

        suvWithElectric.manufacture();
        // Output: SUV Engine started with electricity. Car manufactured.
    }
}
