package abstractFactory.concreteFactory;

import abstractFactory.concreteClasses.JavaScriptDeveloper;
import abstractFactory.concreteClasses.JavaScriptTestEngineer;
import abstractFactory.interfaces.DepartmentFactory;
import abstractFactory.interfaces.Developer;
import abstractFactory.interfaces.TestEngineer;

public class JavaScriptDepartmentFactory implements DepartmentFactory {
    @Override
    public Developer hireDeveloper() {
        return new JavaScriptDeveloper();
    }

    @Override
    public TestEngineer hireTestEngineer() {
        return new JavaScriptTestEngineer();
    }
}
