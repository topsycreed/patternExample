package facade;

public class CarFacade {
    private Engine engine;
    private HeatedSeats heatedSeats;
    private StereoSystem stereoSystem;

    public CarFacade(Engine engine, HeatedSeats heatedSeats, StereoSystem stereoSystem) {
        this.engine = engine;
        this.heatedSeats = heatedSeats;
        this.stereoSystem = stereoSystem;
    }

    public void turnOnCar() {
        engine.on();
        heatedSeats.on();
        stereoSystem.on();
        stereoSystem.playTrack("Queen - I'm in love with my car");
    }

    public void turnOffCar() {
        engine.off();
        heatedSeats.off();
        stereoSystem.off();
    }

    public void increaseHeatedSeat() {
        heatedSeats.increaseHeatLevel();
    }

    public void playTrack(String title) {
        stereoSystem.playTrack(title);
    }
}
