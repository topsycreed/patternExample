package abstractFactory;

import abstractFactory.concreteFactory.JavaDepartmentFactory;
import abstractFactory.concreteFactory.JavaScriptDepartmentFactory;
import abstractFactory.interfaces.DepartmentFactory;
import abstractFactory.interfaces.Developer;
import abstractFactory.interfaces.TestEngineer;

public class Department {
    private final Developer developer;
    private final TestEngineer testEngineer;

    public Department(DepartmentFactory factory) {
        developer = factory.hireDeveloper();
        testEngineer = factory.hireTestEngineer();
    }

    public static Department configDepartment() {
        DepartmentFactory factory;
        String techStack = System.getProperty("techStack") == null ? "unknown" : System.getProperty("techStack").toLowerCase();
        switch (techStack) {
            case "java":
                factory = new JavaDepartmentFactory();
                break;
            case "javascript":
                factory = new JavaScriptDepartmentFactory();
                break;
            default:
                throw new RuntimeException("Such tech stack type doesn't exist but if you will send me a one BTC then I will make it for you");
        }
        return new Department(factory);
    }

    public void work() {
        developer.writeCode();
        testEngineer.writeAutotests();
    }
}
