package visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Review code after Junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Adding indexes to DB");
    }

    @Override
    public void create(Test test) {
        System.out.println("Adding testing framework");
    }
}
