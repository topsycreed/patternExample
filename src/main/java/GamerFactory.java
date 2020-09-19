import constants.GamerType;

public class GamerFactory extends AbstractGamerFactory {

    @Override
    Gamer createGamer(GamerType gamerType, String gamerName, String gamerReaction) {
        switch (gamerType) {
            case CASUAL:
                return new CasualGamer(gamerName, gamerReaction);
            case HARDCORE:
                return new HardCoreGamer(gamerName, gamerReaction);
            default:
                throw new RuntimeException("Such gamer type doesn't exist but if you will send me a one BTC then I will make it for you");
        }
    }
}
