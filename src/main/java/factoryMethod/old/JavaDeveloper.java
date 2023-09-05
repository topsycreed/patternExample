package factoryMethod.old;

import factoryMethod.Developer;

import static utils.Messages.printMessage;

public class JavaDeveloper implements Developer {
    public void writeCode() {
        printMessage("Java dev writes Java code");
    }
}
