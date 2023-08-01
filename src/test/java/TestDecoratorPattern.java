import decorator.Developer;
import decorator.JavaDeveloper;
import decorator.SeniorJavaDeveloper;
import decorator.TeamLead;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDecoratorPattern {

    @Test
    public void basicTest() {
        Developer developer = new JavaDeveloper();
        assertEquals("Write Java code.", developer.makeCode());
    }

    @Test
    public void extendedTest() {
        Developer developer = new TeamLead(new JavaDeveloper());
        assertEquals("Write Java code. Code review.", developer.makeCode());
    }

    @Test
    public void doubleExtendedTest() {
        Developer developer = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        assertEquals("Write Java code. Make framework. Code review.", developer.makeCode());
    }
}
