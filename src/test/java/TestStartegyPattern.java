import org.junit.jupiter.api.Test;
import strategy.*;

public class TestStartegyPattern {

    @Test
    public void test() {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.startActivity();
        developer.setActivity(new Training());
        developer.startActivity();
        developer.setActivity(new Coding());
        developer.startActivity();
    }
}
