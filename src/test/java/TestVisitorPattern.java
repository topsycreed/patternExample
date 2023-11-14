import org.junit.jupiter.api.Test;
import visitor.Developer;
import visitor.JuniorDeveloper;
import visitor.Project;
import visitor.SeniorDeveloper;

public class TestVisitorPattern {

    @Test
    public void test() {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior:");
        project.beWritten(junior);
        System.out.println("Senior:");
        project.beWritten(senior);
    }
}
