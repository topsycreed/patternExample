package builder.cars;

import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class CarLombok {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel;
}
