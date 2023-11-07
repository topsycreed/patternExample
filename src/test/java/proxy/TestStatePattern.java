package proxy;

import org.junit.jupiter.api.Test;
import state.Activity;
import state.Developer;
import state.Sleeping;

public class TestStatePattern {

    @Test
    public void test() {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.startActivity();
            developer.changeActivity();
        }
    }
}
