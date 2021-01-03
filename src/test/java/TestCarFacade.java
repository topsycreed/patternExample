import facade.CarFacade;
import facade.Engine;
import facade.HeatedSeats;
import facade.StereoSystem;
import org.junit.Before;
import org.junit.Test;
import utils.Logger;
import utils.Messages;

import static constants.Constants.*;
import static org.junit.Assert.assertEquals;

public class TestCarFacade {

    @Before
    public void clearMessages() {
        Messages.clearText();
        Logger.getInstance();
    }

    @Test
    public void testCarTurnedOn() {
        Engine engine = new Engine();
        HeatedSeats heatedSeats = new HeatedSeats();
        StereoSystem stereoSystem = new StereoSystem();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        assertEquals(Messages.getText(), CAR_ON_MESSAGES);
    }

    @Test
    public void testCarPlayedTrack() {
        Engine engine = new Engine();
        HeatedSeats heatedSeats = new HeatedSeats();
        StereoSystem stereoSystem = new StereoSystem();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        carFacade.playTrack("Queen - Bohemian Rhapsody");
        assertEquals(Messages.getText(), CAR_PLAY_TRACK_MESSAGES);
    }

    @Test
    public void testCarTurnedOff() {
        Engine engine = new Engine();
        HeatedSeats heatedSeats = new HeatedSeats();
        StereoSystem stereoSystem = new StereoSystem();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        carFacade.turnOffCar();
        assertEquals(Messages.getText(), CAR_OFF_MESSAGES);
    }
}
