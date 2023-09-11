package abstractFactory.concreteClasses;

import abstractFactory.interfaces.TestEngineer;

import static utils.Messages.printMessage;

public class JavaScriptTestEngineer implements TestEngineer {
    @Override
    public void writeAutotests() {
        printMessage("JavaScript test engineer writes JavaScript tests");
    }
}
