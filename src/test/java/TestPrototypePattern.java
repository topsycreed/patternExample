import org.junit.jupiter.api.Test;
import prototype.Project;
import prototype.ProjectFactory;

public class TestPrototypePattern {

    @Test
    public void versionControlRunner() {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone2 = projectFactory.cloneProject();
        System.out.println(masterClone2);
    }
}
