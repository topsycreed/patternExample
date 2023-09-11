import factoryMethod.Developer;
import factoryMethod.DeveloperFactory;
import factoryMethod.JavaDeveloperFactory;
import factoryMethod.JavaScriptDeveloperFactory;
import factoryMethod.old.JavaDeveloper;
import factoryMethod.old.JavaScriptDeveloper;
import org.junit.jupiter.api.Test;
import utils.Messages;

import static constants.Constants.DEVS_MESSAGES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactoryMethodPattern {

    @Test
    public void oldWay() {
        String name = "javaScript";
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        JavaScriptDeveloper javaScriptDeveloper = new JavaScriptDeveloper();
        Developer javaDeveloper2 = new JavaDeveloper();
        Developer developer;
        if ("java".equalsIgnoreCase(name)) {
            developer = new JavaDeveloper();
        } else {
            developer = new JavaScriptDeveloper();
        }
        javaDeveloper2.writeCode();

        javaDeveloper.writeCode();
        javaScriptDeveloper.writeCode();
        developer.writeCode();

        assertEquals(DEVS_MESSAGES, Messages.getText());
    }

    @Test
    public void test() {
        DeveloperFactory developerFactory1 = createDeveloperBySpecialization("java");
        DeveloperFactory developerFactory2 = createDeveloperBySpecialization("javaScript");

        Developer javaDev = developerFactory1.createDeveloper();
        Developer jsDev = developerFactory2.createDeveloper();
        javaDev.writeCode();
        jsDev.writeCode();

        assertEquals(DEVS_MESSAGES, Messages.getText());
    }

    static DeveloperFactory createDeveloperBySpecialization(String specialization) {
        if ("java".equalsIgnoreCase(specialization)) {
            return new JavaDeveloperFactory();
        }
        if ("javaScript".equalsIgnoreCase(specialization)) {
            return new JavaScriptDeveloperFactory();
        }
        throw new RuntimeException(String.format("Specialization %s is not supported!", specialization));
    }
}
