package factoryMethod;

import static utils.Messages.printMessage;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        printMessage("Java dev writes Java code");
    }
}
