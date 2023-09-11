package abstractFactory.concreteClasses;

import abstractFactory.interfaces.TestEngineer;

import static utils.Messages.printMessage;

public class JavaTestEngineer implements TestEngineer {
    @Override
    public void writeAutotests() {
        printMessage("Java test engineer writes Java tests");
    }
}
