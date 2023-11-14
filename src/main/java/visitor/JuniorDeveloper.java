package visitor;

public class JuniorDeveloper implements Developer{

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing simple class");
    }

    @Override
    public void create(Database database) {
        System.out.println("Writing simple database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing simple smoke test");
    }
}
