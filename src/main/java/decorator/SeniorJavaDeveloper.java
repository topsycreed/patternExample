package decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String makeFramework() {
        return " Make framework.";
    }

    @Override
    public String makeCode() {
        return super.makeCode() + makeFramework();
    }
}
