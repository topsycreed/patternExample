package factoryMethod;

import static utils.Messages.printMessage;

public class JavaScriptDeveloper implements Developer {
    @Override
    public void writeCode() {
        printMessage("JavaScript dev writes JavaScript code");
    }
}
