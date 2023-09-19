import builder.CarBuilder;
import builder.CarManualBuilder;
import builder.Director;
import builder.cars.Car;
import builder.cars.CarLombok;
import builder.cars.CarType;
import builder.cars.Manual;
import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;
import org.junit.jupiter.api.Test;

public class TestBuilderPattern {

    @Test
    public void test() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        builder.getResult();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

    @Test
    public void lombok() {
        CarLombok carLombok = CarLombok.builder()
                .seats(1)
                .fuel(2)
                .gpsNavigator(new GPSNavigator())
                .transmission(Transmission.MANUAL)
                .tripComputer(new TripComputer())
                .carType(CarType.CITY_CAR)
                .engine(new Engine(1, 1))
                .build();
        System.out.println("\nCar built:\n" + carLombok);
    }
}
