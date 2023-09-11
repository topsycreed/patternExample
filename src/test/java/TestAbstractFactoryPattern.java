import abstractFactory.Department;
import org.junit.jupiter.api.Test;
import utils.Messages;

import static abstractFactory.Department.configDepartment;
import static constants.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAbstractFactoryPattern {
    @Test
    public void testJava() {
        System.setProperty("techStack", "java");
        Department department = configDepartment();
        department.work();

        assertEquals(JAVA_DEPARTMENT, Messages.getText());
    }

    @Test
    public void testJavaScript() {
        System.setProperty("techStack", "javaScript");
        Department department = configDepartment();
        department.work();

        assertEquals(JAVASCRIPT_DEPARTMENT, Messages.getText());
    }

    @Test
    public void testUnknown() {
        Throwable exception = assertThrows(
                RuntimeException.class,
                Department::configDepartment
        );
        assertEquals(UNKNOWN_DEPARTMENT, exception.getMessage());
    }
}
