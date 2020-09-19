import constants.GamerType;

import static utils.Messages.printMessage;

public abstract class AbstractGamerFactory {

    abstract Gamer createGamer(GamerType type, String gamerName, String gamerReaction);

    Gamer produceGamer(GamerType type, String gamerName, String gamerReaction) {
        Gamer gamer = createGamer(type, gamerName, gamerReaction);
        if (gamer == null) {
            printMessage("Sorry, we are not able to born such beautiful gamer '" + gamer.getName());
            return null;
        }
        printMessage("Parents made a '" + gamer.getName() + "' from a new brand child factory!");
        //TODO add some more logic here
        return gamer;
    }
}
