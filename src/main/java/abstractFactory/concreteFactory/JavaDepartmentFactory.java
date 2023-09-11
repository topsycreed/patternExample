package abstractFactory.concreteFactory;

import abstractFactory.concreteClasses.JavaDeveloper;
import abstractFactory.concreteClasses.JavaTestEngineer;
import abstractFactory.interfaces.DepartmentFactory;
import abstractFactory.interfaces.Developer;
import abstractFactory.interfaces.TestEngineer;

public class JavaDepartmentFactory implements DepartmentFactory {
    @Override
    public Developer hireDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public TestEngineer hireTestEngineer() {
        return new JavaTestEngineer();
    }
}
