import facade.CarFacade;
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
        CarFacade carFacade = new CarFacade();

        carFacade.turnOnCar();
        assertEquals(Messages.getText(), CAR_ON_MESSAGES);
    }

    @Test
    public void testCarPlayedTrack() {
        CarFacade carFacade = new CarFacade();

        carFacade.turnOnCar();
        carFacade.playTrack("Queen - Bohemian Rhapsody");
        assertEquals(Messages.getText(), CAR_PLAY_TRACK_MESSAGES);
    }

    @Test
    public void testCarTurnedOff() {
        CarFacade carFacade = new CarFacade();

        carFacade.turnOnCar();
        carFacade.turnOffCar();
        assertEquals(Messages.getText(), CAR_OFF_MESSAGES);
    }
}
