package factoryMethod.old;

import factoryMethod.Developer;

import static utils.Messages.printMessage;

public class JavaScriptDeveloper implements Developer {
    public void writeCode() {
        printMessage("JavaScript dev writes JavaScript code");
    }
}
